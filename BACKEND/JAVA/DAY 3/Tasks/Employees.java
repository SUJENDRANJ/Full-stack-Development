package SUJE;

public class Employees {

	//Write a Java program to create a class called "Employee" with a name, job title, 
	//and salary attributes, and methods to calculate and update salary.
	
	String name;
	String job;
	int salary;
	
	Employees(String name, String job, int salary){
		this.name = name; 
		this.salary = salary; 
		this.job = job; 
	}
	
	void calculateSalary() {
		display();
	}
	
	void updateSalary(int newSal) {
		salary = newSal;
	}
	
	void display() {
		System.out.println(name +" - " +job + " -  "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees obj = new Employees("Suje","IT",2000);
		
		obj.calculateSalary();
		obj.updateSalary(1000);
		obj.calculateSalary();
	}

}
