package swingobserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.setProperty("javax.accessibility.assistive_technologies", "");
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngleListener());
		frame.setSize(200, 100);
		frame.add(button);
		frame.setVisible(true);

	}

}

 class AngleListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("I am the observer that implements the observer interface!");
		
	}
	
}
