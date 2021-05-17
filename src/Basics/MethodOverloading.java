package Basics;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===MethodOverloading========================\n");
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		
		int i = obj.sum(7, 2);
		double d = obj.sum(7.2, 2.7);
		String s = obj.sum("Raja", "Ram");
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		System.out.println("\n=================================== End ===MethodOverloading========================\n");
	}

	
	public void sum() {
		
		System.out.println("sum method -- no input parameters!");
		
		// (1) You can not create a method inside a method
		// The following is not valid
		//public void test() {
		//	
		//}
		
		// (2) method overloading = same method name with different set of arguments data types in the same class--- this is valid
		
		// (3) duplicate methods  = same method name with same set of arguments data types in the same class --- this is NOT valid
		
		// (4) method overloading of main() method is valid
		
	}
	

	public static void main(String s) { }
	public static void main(int x) { }
	public static void main(int x, int y) { }
	
	public int sum(int x,int y) {
		
		System.out.println("sum method -- integer input parameters!");
		return x+y;
	}
	

	public double sum(double x, double y) {
		
		System.out.println("sum method -- double input parameters!");
		return x+y;
	}
	

	public String sum(String x, String y) {
		
		System.out.println("sum method -- String input parameters!");
		return x+y;
	}	
	
}
