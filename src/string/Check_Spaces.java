package string;

public class Check_Spaces {
	
	public static void main(String[] args) {
		String name="Archana Nitin Ghate";
		char[]c1 = name.toCharArray();
		
		for(int i=0; i<name.length();i++)
		{
		boolean answer = Character.isSpaceChar(c1[2]);
		
		if(answer==true)
		{
			System.out.println("");
		}
		}
	}

}
