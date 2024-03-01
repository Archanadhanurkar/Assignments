package string;

//Assignment No 41=write a program to check whether the given string is palindrome or not
public class PalindromeNumber {
	public static void main(String[] args) {
		
	String Input="nitin";
	String Output="";
	
	for(int i=Input.length()-1;i>=0;i--)
	{
		Output = Output + Input.charAt(i);
	}
     System.out.println(Output);
     
     if(Input==Output)
     {
    	 System.out.println("Given string is Palindrome.");
     }
     else
     {
    	 System.out.println("Given string is not Palindrome.");
     }
}
}