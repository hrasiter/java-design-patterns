package commandpattern;

public class Light {
	
	String roomName;
	
	public Light(String roomName) {
		
		this.roomName = roomName;
	}
	
	public void on() {
		System.out.println(roomName + " light on");
	}
	
	public void off() {
		System.out.println(roomName + " light off");
	}
}
