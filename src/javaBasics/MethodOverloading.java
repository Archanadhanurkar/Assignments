package javaBasics;
//Assignment No.18=Write a program with 4 Static method and 4 Non-Static method make sure all have same name
public class MethodOverloading {
	
	static void m1() 
	{
		System.out.println("Method 1");
	}
	static void m1(int a, int b) 
	{
		System.out.println("Method 2");
	}
	static void m1(boolean a) 
	{
		System.out.println("Method 3");
	}
	static void m1(char a) 
	{
		System.out.println("Method 4");
	}
	void m1(String a) 
	{
		System.out.println("Method 5");
	}
	void m1(int c) 
	{
		System.out.println("Method 6");
	}
	void m1(double a) 
	{
		System.out.println("Method 7");
	}
	void m1(float c) 
	{
		System.out.println("Method 8");
	}
}
