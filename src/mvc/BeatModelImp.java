package mvc;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModelImp implements BeatModel, MetaEventListener {

	Sequencer sequencer;

	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

	int bpm = 90;
	Sequence sequence;
	Track track;
	
	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	@Override
	public void on() {
		System.out.println("Starting the sequencer");
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		return bpm;
	}

	void beatEvent() {
		notitfyBeatObservers();
	}

	@Override
	public void registerObserver(BeatObserver observer) {
		beatObservers.add(observer);

	}

	@Override
	public void removeObserver(BeatObserver observer) {
		beatObservers.remove(observer);

	}

	@Override
	public void registerObserver(BPMObserver observer) {
		bpmObservers.add(observer);

	}

	@Override
	public void removeObserver(BPMObserver observer) {
		bpmObservers.remove(observer);

	}

	@Override
	public void notifyBPMObservers() {
		Iterator<BPMObserver> iterator = bpmObservers.iterator();
		while (iterator.hasNext()) {
			BPMObserver bpmObserver =  iterator.next();
			bpmObserver.updateBPM();
		}

	}

	@Override
	public void notitfyBeatObservers() {
		Iterator<BeatObserver> iterator = beatObservers.iterator();
		while (iterator.hasNext()) {
			BeatObserver beatObserver =  iterator.next();
			beatObserver.updateBeat();

		}
	}
	
	@Override
	public void meta(MetaMessage message) {
		if (message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	private void buildTrackAndStart() {
		int[] trackList = {35, 0, 46, 0};
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));
		try {
			sequencer.setSequence(sequence);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void makeTracks(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int key = list[i];
			if (key != 0) {
				track.add(makeEvent(144,9,key, 100, i));
				track.add(makeEvent(128,9,key, 100, i+1));
			}
		}
	}

	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
	{
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return event;
	}

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
