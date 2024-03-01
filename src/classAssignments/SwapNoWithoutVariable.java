package classAssignments;

public class SwapNoWithoutVariable {
	
	public static void main(String[] args) {
		int x=100;
		int y=200;
	
		System.out.println("Values before Swapping are "+x+","+y);
		
		x=x+y; //300
		y=x-y; //100
		x=x-y; //200
		
		System.out.println("Values after Swapping are "+x+","+y);

}
}
