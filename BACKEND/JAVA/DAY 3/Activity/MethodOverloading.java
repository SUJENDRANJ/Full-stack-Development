package SUJE;

public class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Welcome " +name);
	}
	void myMethod(int a, int b) {
		System.out.println("Sum " +(a+b));
	}
	void myMethod(int n) {
		System.out.println("Add " +(n+n));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.myMethod(3);
		obj.myMethod("Suje");
		obj.myMethod(10, 20);
	}
}
