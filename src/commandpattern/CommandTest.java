package commandpattern;

public class CommandTest {

	public static void main(String[] args) {

		/***
		 * 
		 * Simple Remote Control
		 * 
		 ****/
//		SimpleRemoteControl remote = new SimpleRemoteControl();
//		
//		Light light = new Light();
//		
//		LightOnCommand command = new LightOnCommand(light);
//		
//		GarageDoor garageDoor = new GarageDoor();
//		
//		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//		
//		
//		remote.setCommand(command);
//		
//		remote.buttonPressed();
//		
//		remote.setCommand(garageOpen);
//		
//		remote.buttonPressed();
		
		/****************************
		 * 							*	
		 * Remote Control Loader	*
		 *  						*	
		 ****************************/
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
//		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//		remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
		
		/*** lambda expressions 
		 * 
		 * 1- Labda expression bir functional interface tanımına ihtiyaç duyuyor.
		 * 2- Bunun için Command Interface'inde @FunctionalInterface annotation'ı yapmak gerekiyor.
		 * 3- Bu annotation ise interface'in sadece tek bir method içerdiğini garantiliyor.
		 * 4- Command Interface'ine undo özelliği eklenmek istenirse tüm yapılanlar geri alınmalı!
		 * 
		 * ****/
		
		remoteControl.setCommand(0, () -> {livingRoomLight.on();}, () -> {livingRoomLight.off();} );
		remoteControl.setCommand(1, () -> kitchenLight.on() , () -> kitchenLight.off() );
		//method reference
		remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		remoteControl.undoCommandPressed();
		
		remoteControl.onButtonPressed(1);
		remoteControl.offButtonPressed(1);
		remoteControl.undoCommandPressed();
		
		remoteControl.onButtonPressed(2);
		remoteControl.offButtonPressed(2);
		remoteControl.undoCommandPressed();
		
		remoteControl.offButtonPressed(6);
		remoteControl.undoCommandPressed();
	}

}
