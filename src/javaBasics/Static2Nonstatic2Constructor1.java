package javaBasics;
//Assignment No.17=Write a program with 2 Static method,2 Non-Static method,and one Constructor
public class Static2Nonstatic2Constructor1 {
	static void add() 
	{
		System.out.println("This is add method.");
	}
	static void Subtract() 
	{
		System.out.println("This is Subtract method.");
	}
    void multiplication() 
	{
		System.out.println("This is multiplication method.");
	}
	static void division() 
	{
		System.out.println("This is division method.");
	}
	Static2Nonstatic2Constructor1()
	{
		System.out.println("This is Constructor.");
	}
	public static void main(String[] args) {
		Static2Nonstatic2Constructor1 c1=new Static2Nonstatic2Constructor1();
		add() ;
		Subtract();
		c1.multiplication();
		division() ;

	}
}
