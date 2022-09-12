package mypackage;

public class Driver {

	public static void main(String[] args) {

		Sound carSound = new Sound("Car", 4);
		Sound boatSound = new Sound("Boat", 13);
		Sound planeSound = new Sound("Plane", 30.2);
		Sound bikeSound = new Sound("Bike", 6.6);
		Sound unkownSound = new Sound();
		
		unkownSound.setName("UFO");
		unkownSound.setLength(7.7);
		
		LLStack stack = new LLStack();
		
		stack.push(carSound);
		stack.push(unkownSound);
		stack.push(boatSound);
		stack.push(planeSound);
		stack.push(bikeSound);
		
		stack.pop();
		stack.pop();
		
		System.out.println("Last Sound:\n");
		System.out.println( "Sound Name: " + ((Sound) stack.topEl()).getName() 
						+ "\nSound Length: " + ((Sound) stack.topEl()).getLength() );
	}
}
