package Basics;

public class NonStaticLocalAndGlobalVariables {

	// Global non-static variables
	String name = "Raja";
	int    marks = 87;
	
	public static void main(String[] args) {
	
		int i = 78; //Local Variable of main method
		System.out.println(" local variable in main, i = " + i);
		
		
		//System.out.println(" Global non-static variable in this class, name = " + name); // Not valid, name is a non-static class variable
		NonStaticLocalAndGlobalVariables obj = new NonStaticLocalAndGlobalVariables();
		System.out.println(" Global non-static variable in this class, name = " + obj.name);
		System.out.println(" Global non-statoc variable in this class, marks = " + obj.marks);
		
		obj.anotherMethod();
		
	}
	
	
	public void anotherMethod() {
		
		int marks = 99; //Local Variables pf anotherMethod
		int j = 110;
		int i = 100;
		
		
		System.out.println(" local variable in anotherMethod, i = " + i);
		System.out.println(" local variable in anotherMethod, j = " + j);
		
		System.out.println(" Local variable in this class, marks = " + marks);
		
		NonStaticLocalAndGlobalVariables obj = new NonStaticLocalAndGlobalVariables();
		System.out.println(" Global non-static variable in this class, marks = " + obj.marks);
				
		
		
	}

}
