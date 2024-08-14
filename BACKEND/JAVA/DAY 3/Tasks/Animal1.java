package SUJE;
//6. Write a Java program to create a class called Animal with a method named move(). 
//Create a subclass called Cheetah that overrides the move() method to run.

class Animals1{
	void move() {
		System.out.println("Animal is Walking");
	}
}

class Cheetah extends Animals1{
	void move() {
		System.out.println("Cheetah is Running");
	}
}

public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals1 obj = new Cheetah();
		
		obj.move();
	}

}
