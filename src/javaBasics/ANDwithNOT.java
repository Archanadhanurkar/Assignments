package javaBasics;

public class ANDwithNOT {

	public static void main(String[] args) {
		
		int age=21;
		int salary=10000;
		
		if(!(age==21 && salary==10000))
		{
			System.out.println("I am eligible to vote");
		}
		else
		{
			System.out.println("I am not eligible to vote");
		}
	}

}
