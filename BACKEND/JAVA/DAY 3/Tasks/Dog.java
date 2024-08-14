package SUJE;

//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, 
//set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Dog {
	private String dName;
	private String dBreed;
	
	Dog(String dName,String dBreed){
		this.dName=dName;
		this.dBreed=dBreed;

	}
	void setDog(String dNameNew, String dBreedNew){
		this.dName=dNameNew;
		this.dBreed=dBreedNew;
		this.display();
	}
	void display() {
		System.out.println(dName + " - " + dBreed);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog("Gimmi","German Shepard");
		Dog obj1 = new Dog("Jacky","Pug");
		
		obj.setDog("Mani","German Shepard");
		obj1.setDog("Mama","Pug");
	}

}
