package mypackage;

public class Driver {

	public static void main(String[] args) {

		// Create sounds Objects
		Sound carSound = new Sound("Car", 4);
		Sound boatSound = new Sound("Boat", 13);
		Sound planeSound = new Sound("Plane", 30.2);
		Sound bikeSound = new Sound("Bike", 6.6);
		Sound unkownSound = new Sound();
		
		// Set Attreibutes for the unknown sounds
		unkownSound.setName("UFO");
		unkownSound.setLength(7.7);
		
		// Create Stack
		LLStack stack = new LLStack();
		
		// Push the sounds
		stack.push(carSound);
		stack.push(unkownSound);
		stack.push(boatSound);
		stack.push(planeSound);
		stack.push(bikeSound);
		
		// Pop the two last sounds
		stack.pop();
		stack.pop();
		
		// Output the Sound at the top of the stack (Last Sound)
		System.out.println("Last Sound:\n");
		System.out.println( "Sound Name: " + ((Sound) stack.topEl()).getName() 
						+ "\nSound Length: " + ((Sound) stack.topEl()).getLength() );
	}
}
