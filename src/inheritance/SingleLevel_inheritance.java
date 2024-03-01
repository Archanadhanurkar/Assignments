package inheritance;

class Parent{
	void add() {
		System.out.println("This is add method.");
	}
	static void Circle() {
		System.out.println("This is a circle.");
	}
}
public class SingleLevel_inheritance extends Parent {
	
	static void Rectangle() {
		System.out.println("This is a Rectangle.");
	}
	void Square() {
		System.out.println("This is a Square.");
	}

	public static void main(String[] args) {
		SingleLevel_inheritance sl = new SingleLevel_inheritance();
		sl.add();
		Circle();
		Rectangle();
		sl.Square();
		
	}
}
