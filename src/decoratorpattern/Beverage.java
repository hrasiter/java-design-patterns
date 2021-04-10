package decoratorpattern;

public abstract class Beverage {
	public enum Size {
		SHORT,
		TALL,
		GRANDE,
		VENTI
	}

	Size size = Size.SHORT;
	String description = "Unknown beverage";
	
	public String getDescription() {
		return getSize() + description;
	}
	
	public abstract double cost();

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
