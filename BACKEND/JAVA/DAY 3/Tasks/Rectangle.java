package SUJE;

public class Rectangle {
	//Write a Java program to create a class called "Rectangle" with width and height attributes. 
	//Calculate the area and peri-meter of the rectangle.
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		area();
		perimeter();
	}
	void area() {
		System.out.println("Area of Rectangle : " + (width*height));

	}
	void perimeter() {
		System.out.println("Perimeter of Rectangle : " + 2*(height + width));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(2,2);
		
	}

}
