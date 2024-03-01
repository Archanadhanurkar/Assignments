package inheritance;

interface Mihir{
	void circle();
	void rectangle();
}
interface Nitin{
	void triangle();
	void square();
}
interface Nupur {
	void sphere();
	void cone();
}
interface Ghate {
	void trapezium();
	void hexagon();
}
public class MultipleInheritance_4parents implements Mihir,Nitin,Nupur,Ghate{
	public void trapezium() {
		System.out.println("I am a trapezium.");
	}
	public void hexagon() {
		System.out.println("I am a Hexagon.");
	}
	public void sphere() {
		System.out.println("I am a Sphere.");
	}
	public void cone() {
		System.out.println("I am a Cone.");
	}	
	public void triangle() {
		System.out.println("I am a Triangle.");
	}
	public void square() {
		System.out.println("I am a Square.");
	}
	public void circle() {
		System.out.println("I am a Circle.");
	}
	public void rectangle() {
		System.out.println("I am a Rectangle.");
	}	
	public static void main(String[] args) {
		
		MultipleInheritance_4parents mp = new MultipleInheritance_4parents();
		
		mp.circle();
		mp.rectangle();
		mp.triangle();
		mp.square();
		mp.sphere();
		mp.cone();
		mp.hexagon();
		mp.trapezium();
	}
}
