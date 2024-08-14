package SUJE;


public class Circle {
	//4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
	//Calculate the area and circumference of the circle.
	double radius;
	
	void modify(double radius) {
		this.radius=radius;
		area();
		circumference();
	}
	
	void area(){
		System.out.println("Area of circle : " +Math.PI*Math.pow(radius, 2));
	}
	void circumference() {
		System.out.println("circumference of circle : " + 2*Math.PI*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		
		obj.modify(3);
		obj.modify(5);

		
	}

}
