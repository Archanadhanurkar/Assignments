package javaBasics;
//Assignment No.34-Write a program to call the parent class constructor using super calling statement

class Parent{
	Parent(String a)
	{
		System.out.println("This is a Parent Constructor");
	}
}
public class SuperCalling extends Parent {
	SuperCalling()
	{   super("Archana");
		System.out.println("This is a Child Constructor");
	}
	
	public static void main(String[] args) {
		
		SuperCalling s1 = new SuperCalling();
	}
     
}
