package javaBasics;


interface one {
	
	void m1();
	void m2();
	}

abstract class Two implements one{
	
	abstract void m3();
	abstract void m4();
	static void m5() {
		System.out.println("This is method 5");
	}
	void m6() {
		System.out.println("This is method 6");
	}

	}
	
abstract class Three extends Two {
	abstract void m7();
	abstract void m8();
	
}

public class MultipleInheritence extends Three {
	static void m9() {
		System.out.println("This is method 9");
		}
	void m10() {
		System.out.println("This is method 10");
	}
	
	public static void main(String[] args) {
		
	m9();
	m5();
	
		
	
	}
	
	public void m1() {
	
		System.out.println("1");
	}
	
	public void m2() {
		
		System.out.println("2");
	}
	
	void m7() {
		
		System.out.println("3");
	}

	void m8() {
	
		System.out.println("4");
	}
	
	void m3() {
		
		System.out.println("5");
	}
	void m4() {
		
		System.out.println("6");
	}
}
