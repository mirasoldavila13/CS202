
public class Triangle extends GeometricShape{
//triangle should contain the base and height.
	double base, height;

public Triangle(double base, double height) {
	super("Triangle", "Purple");
	this.base = base;
	this.height = height;
}


@Override
public String toString() {
	return "Triangle [base=" + base + ", height=" + height + ", name=" + name + ", color=" + color
			+ ", calculateArea()=" + calculateArea() + "]";
}




public double calculateArea(){
	double area = (1.0/2.0) * this.base * this.height;
	return area;
}
}
