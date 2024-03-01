package javaAssignments;

public class ConstructorStaticandnonstatic {
	
	static void m1() {
		System.out.println("This is m1 method.");
	}
	static void m2() {
		System.out.println("This is m2 method.");
		
	}
	void m3() {
		System.out.println("This is m3 method.");
	}
	void m4() {
		System.out.println("This is m4 method.");
	}
	ConstructorStaticandnonstatic(){
		System.out.println("This is my constructor.");
	}
	

	public static void main(String[] args) {
		
		m1();
		m2();
		
		ConstructorStaticandnonstatic c1 = new ConstructorStaticandnonstatic();
		c1.m3();
		c1.m4();
	}
}
