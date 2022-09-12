package mypackage;

public class Sound {
	// Attributes
	public String name;
	public double length;
	
	// Empty constructor
	public Sound() {
		
	}
	
	// Constructor with attribute fields
	public Sound(String name, double length) {
		super();
		this.name = name;
		this.length = length;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}
