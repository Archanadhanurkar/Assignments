package classAssignments;

import java.util.Scanner;

public class Factorial_Scanner {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s1.nextInt();
		int a=1;
		
		for(int i=1; i<=n; i++) {
			a=a*i;
		}
		System.out.println(a);
		
		
		
		
	}

}
