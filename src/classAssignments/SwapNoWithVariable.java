package classAssignments;

public class SwapNoWithVariable {
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
	
		System.out.println("Values before Swapping are "+x+","+y);
		
		int z = x;  //using c as a third variable
		x = y;
		y = z;
		
		System.out.println("Values after Swapping are "+x+","+y);
		
	}

}
