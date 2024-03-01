package string;

public class String_Length {
	public static void main(String[] args) {
		
		String name = "mihir";
		String name1="";
		
		int a =name.length(); //Gives the length of String.
		
		System.out.println(a);   //It will give the length of the String.
		
		System.out.println(name1.isEmpty());  //will check if the string is empty.
		System.out.println(name.isEmpty());
		
		System.out.println(name.indexOf('m')); //Prints the index of char.
		
		System.out.println(name.toLowerCase()); //Converts string to lower letters.
		
		System.out.println(name.toUpperCase()); //Converts string to upper case.
		
	}

}
