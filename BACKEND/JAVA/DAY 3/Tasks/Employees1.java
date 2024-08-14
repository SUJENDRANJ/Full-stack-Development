package SUJE;
//4. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
class Emp{
	void work() {
		System.out.println("Not Working");
	}
	void getSalary(){
		System.out.println("Salary got");
	}
}

class HRManager extends Emp{
	void work() {
		System.out.println("Working");
	}
	void addEmployee() {
		System.out.println("New Employee Added");
	}
}
public class Employees1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager obj = new HRManager();
		
		obj.work();
		obj.getSalary();
		obj.addEmployee();

	}

}
