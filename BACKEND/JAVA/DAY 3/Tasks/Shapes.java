package SUJE;
//3. Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
class Shape{
	
	void getArea(int l, int b) {
		System.out.println("Area of Shapes");
	}
}
class Rectangle extends Shape{
	void getArea(int l, int b) {
		System.out.println("Area of Rectangle  is "+(l*b));
	}
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		
		obj.getArea(4, 5);
	}

}
