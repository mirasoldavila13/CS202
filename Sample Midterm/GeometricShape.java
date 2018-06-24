
public abstract class GeometricShape {
	//with two String data fields: name and color.
	String name, color;
	
	

	@Override
	public String toString() {
		return "GeometricShape [name=" + name + ", color=" + color + "]";
	}

	public abstract double calculateArea();

public GeometricShape(String name, String color) {
	super();
	this.name = name;
	this.color = color;
}

	
}
