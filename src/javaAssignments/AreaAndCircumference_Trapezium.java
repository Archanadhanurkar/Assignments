package javaAssignments;

public class AreaAndCircumference_Trapezium {

	static int a = 2;
	static int b = 10;
	static int c = 5;
	static int d = 8;
	static int h = 10;
	
	public static void main(String[] args) {
		
		int AreaOfTrapezium = (a+b)*h/2;
		System.out.println(AreaOfTrapezium);
		
		int Circumference = a*b+b*c+c*d+a*d;
		System.out.println(Circumference);
	}

}
