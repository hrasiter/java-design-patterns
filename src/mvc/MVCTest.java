package mvc;

public class MVCTest {

	public static void main(String[] args) {
		BeatModel model = new BeatModelImp();
		Controller controller = new ControllerImp(model);
	}

}
