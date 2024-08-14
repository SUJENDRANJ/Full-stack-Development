package SUJE;

//. Write a Java program to create a class called "" with a name and age attribute. Create two instances of the "Person" class,
//set their attributes using the constructor, and print their name and age.
public class Person {
	String name;
	int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
		this.display();
	}
	
	void display(){
		System.out.println(name + " " + age);
	}
	
	
	public static void main(String[] args) {

		
		Person obj1 = new Person("Suje",22);
		Person obj2 = new Person("Mama",21);

	}

}
