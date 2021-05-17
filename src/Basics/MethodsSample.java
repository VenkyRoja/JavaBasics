package Basics;

public class MethodsSample {

	//---1----- main method = starting point of execution---------------
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===MethodsSample========================\n");
		
		MethodsSample m = new MethodsSample();
		
		m.printTest();
		
		int i = m.returnInt();
		System.out.println(i);
		
		String s = m.returnString();
		System.out.println(s);
		
		double d = m.passParametersDivide(3, 2);
		System.out.println(d);
		
		System.out.println("\n=================================== End ===MethodsSample========================\n");

	}

	
	//----Non-static methods---------------------------2
	//----2-----return nothing (void)-------
	public void printTest() {
		System.out.println("Test");
	}

	//----3-----return an int-------
	public int returnInt() {
		System.out.println("returnInt method");
		int a = 1;
		int b = 2;
		int c = a + b;
		return c;
	}
	

	//----4-----return a string-------
	public String returnString() {
		System.out.println("returnString method");
		String s = "Rama Raja";
		return s;
	}
	

	//----5-----pass parameters-------
	public double passParametersDivide(double x, double y) {
		System.out.println("passing parameters - divide method");
		double z = x/y;
		return z;
	}
	

	
	
	

	//--------------------------------------

}
