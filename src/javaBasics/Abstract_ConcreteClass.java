package javaBasics;

abstract class City{
	
	abstract void Pune();
	abstract void Hyderabad();
	
}

public class Abstract_ConcreteClass {

	static void Aurangabad() {
		System.out.println("1");
	}
	
	void add() {
		System.out.println("This is add method.");
	}
	
	public static void main(String[] args) {
		
		Abstract_ConcreteClass ac = new Abstract_ConcreteClass();
		ac.add();
	}
}
