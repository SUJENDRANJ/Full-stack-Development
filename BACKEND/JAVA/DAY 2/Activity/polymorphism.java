
public class polymorphism {

	polymorphism() {
		this("Suje");
		System.out.println("Polymorphism");
	}

	polymorphism(String name) {
		this("32", "46");
		System.out.println(name);
	}

	polymorphism(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p1 = new polymorphism();

	}

}
