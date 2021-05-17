package Basics;

public class StaticVariables {
	
	String name = "Raja";        // Global non-static variable
	static int    marks = 87;    // Global static variable
	

	public static void main(String[] args) {
		
		
		System.out.println("\n=================================== Begin ===StaticVariables========================\n");
		
		
		// -------- A) Calling static methods and variables------------
		
		staticMethod();                    // 1. direct calling
		
		StaticVariables.staticMethod();    // 2. calling by class name
		
		System.out.println(marks);
		
		System.out.println(StaticVariables.marks);
		
		
		
		// -------- B) Calling non-static methods and variables------------
		
		StaticVariables x = new StaticVariables();
		
		x.nonStaticMethod();
		
		System.out.println(x.name);
		
		//System.out.println(x.marks);   //Technically yes, you can access, but it is not good practice, gives a warning
		
		System.out.println("\n=================================== End ===StaticVariables========================\n");
	}

	
	
	public void nonStaticMethod() {
		
		System.out.println("Non static method");
		
	}
	
	
	public static void staticMethod() {
		
		System.out.println("Static method");
		
	}
		
		
	
	
}
