package mypackage;

public class Sound {
	public String name;
	public double length;
	
	public Sound() {
		
	}
	
	public Sound(String name, double length) {
		super();
		this.name = name;
		this.length = length;
	}

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
