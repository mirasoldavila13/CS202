import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Runner {
	 
	
	public static void main(String[] args) {
		
		//create a GeometricShape ArrayList 
		static ArrayList<GeometricShape> GeoShape = new ArrayList<GeometricShape>();
		
		geometricShape.put("Rectangle", GeoShape);
		geometricShape.put("Triangle", GeoShape);
		
		//add a triangle and rectangle object to it.
 		GeometricShape shape1 = new GeometricShape("Rectangle", "Red");//need to receive the calculated area
 		GeometricShape shape2 = new GeometricShape("Triangle", "Blue");//need to receive the calculated area
 		Rectangle rec = new Rectangle(12.5, 6.32);
 		Triangle tri = new Triangle(3.64, 7.35);
 		GeoShape.add(shape1);
 		GeoShape.add(shape2);
 		GeoShape.add(rec);
 		GeoShape.add(tri);
 		
 		//System.out.println(shape1);
 		
 		//iterate through the hashmap and print out the results of calculateArea for each object in the hashmap
 		printHashMap();
 }
	
	
	

}
