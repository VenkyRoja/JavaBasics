package mainOverload;

public class mainMethodOverloading {

	//---1------------
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===mainMethodOverloading========================\n");
		
		System.out.println("(1) This is main method with String[] parameter  --- JVM looks for this method only i.e. main with String array");
		
		main(10);
		
		main(20, 30);
		
		main("Raja");
		
		
		System.out.println("\n=================================== End ===mainMethodOverloading========================\n");

	}
	
	//---2------------
	public static void main(int a) {
		
		System.out.println("(2) This is main method with one int parameter  ---- a = " + a);
	}

	
	//---3------------
	public static void main(int a, int b) {
		
		System.out.println("(3) This is main method with two int parameters  ---- a = " + a + "  b = " + b);
	}
	
	
	//---4------------
	public static void main(String s) {
		
		System.out.println("(4) This is main method with one String parameter ---- s = " + s);
	}
		
	
	
}
