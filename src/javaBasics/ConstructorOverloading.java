package javaBasics;

//Assignment No.19=write a program for constructor overloading using 10 constructors

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("This is constructor 1.");
	}
	ConstructorOverloading(int a, int b)
	{
		System.out.println("This is constructor 2.");
	}
	ConstructorOverloading(boolean x)
	{
		System.out.println("This is constructor 3.");
	}
	ConstructorOverloading(char c)
	{
		System.out.println("This is constructor 4.");
	}
	ConstructorOverloading(char c, boolean b)
	{
		System.out.println("This is constructor 5.");
	}	
	ConstructorOverloading(boolean a, boolean b)
	{
		System.out.println("This is constructor 6.");
	}	
	ConstructorOverloading(String a, String b)
	{
		System.out.println("This is constructor 7.");
	}
	
	ConstructorOverloading(String b, int a)
	{
		System.out.println("This is constructor 8.");
	}
	
	ConstructorOverloading(String a, char b)
	{
		System.out.println("This is constructor 9.");
	}
	
	ConstructorOverloading(int a)
	{
		System.out.println("This is constructor 10.");
	}
	
public static void main(String[] args) {
	ConstructorOverloading c =new ConstructorOverloading();
	new ConstructorOverloading(10,20);
	new ConstructorOverloading(true);
	new ConstructorOverloading('X');
	new ConstructorOverloading('D',true);
	new ConstructorOverloading(false,true);
	new ConstructorOverloading("Nupur","Nitin");
	new ConstructorOverloading("Mihir",100);
	new ConstructorOverloading("Ghate",'P');
	new ConstructorOverloading(1000);
	
	

	
}
}
