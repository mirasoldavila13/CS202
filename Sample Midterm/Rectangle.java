
public class Rectangle extends GeometricShape {
//Rectangle should contain the width and height, and 
	double width, height;

public Rectangle(double width, double height) {
	super("Rectangle", "Black");// do I need this if I have a hashmap ... good question to ask
	this.width = width;
	this.height = height;
}

public  double calculateArea(){
	double area = this.width * this.height;
	return area;
	
}

@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + ", name=" + name + ", color=" + color
			+ ", calculateArea()=" + calculateArea() + "]";
}


}
