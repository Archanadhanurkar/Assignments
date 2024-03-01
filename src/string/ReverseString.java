package string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "Archana";
		String Reverse = "";
		
		for (int i=name.length()-1; i>=0; i--)
		{
			Reverse = Reverse+name.charAt(i);
	}
		System.out.println(Reverse);
	}
}
