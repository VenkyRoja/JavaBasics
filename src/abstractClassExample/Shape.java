package abstractClassExample;

public abstract class Shape {
	
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println(" Non-abstract meethod - fill ");
	}
	
	Shape() {
		System.out.println(" Constructor - shape ");
	}
	

}
