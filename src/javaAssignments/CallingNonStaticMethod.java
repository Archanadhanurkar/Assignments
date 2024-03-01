package javaAssignments;

//Assignment No.15= How to call non-static method inside a main method
public class CallingNonStaticMethod {
	
	void mult() {
		
		int a =30;
		int b =1290;
		int c =a*b;
		
		System.out.println("Multiplication of a & b :"+c);
	}
	public static void main(String[] args) {
		
		CallingNonStaticMethod c1 = new CallingNonStaticMethod();
		
		c1.mult();
	}

}
