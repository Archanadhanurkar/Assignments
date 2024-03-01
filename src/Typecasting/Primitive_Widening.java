package Typecasting;
public class Primitive_Widening 
{
public static void main(String[] args) 
{
	double wt=52;//widning -Implicit way
	System.out.println(wt);
	wt=4.43455;
	
	//widning- a) Implicit way b) Explicit way
	
	//--------------------------------------
	
	double weight=(double)	90;//widning explicit way
	System.out.println(weight);
	
	//=================
	byte a1=90;
	//byte into int->widning
	int a2=			a1;
	System.out.println(a2);
}
}
