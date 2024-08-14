package SUJE;
//1. Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal{
	void makeSound() {
		System.out.println("Animal makes Sound");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat makes Sound Meow");
	}
}


public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Cat();
		
		obj.makeSound();
	}

}
