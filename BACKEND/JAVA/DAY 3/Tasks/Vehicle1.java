package SUJE;
//2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car
//that overrides the drive() method to print "Repairing a car".
class Vehicles{
	void drive(){
		System.out.println("Driving");
	}	
}

class Car extends Vehicles{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.drive();
	}

}
