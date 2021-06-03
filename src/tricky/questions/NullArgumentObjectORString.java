package tricky.questions;

public class NullArgumentObjectORString {

	//----1---------
	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===NullArgumentObjectORString========================\n");
		
		printProblemStatement();
		
		aMethod(null);
			
		System.out.println("\n=================================== End ===NullArgumentObjectORString========================\n");		
		

	}
	
	//----2---------
	public static void aMethod(Object x) {
		
		String a = 	"""
					
					..........Answer...........
					
					The method with Object as the argument
					is called!!!
					""";
		System.out.println(a + "\n");
		
	}
	
	
	//----3---------
	public static void aMethod(String x) {
		
		String a = 	"""
					
					..........Answer...........
					
					The method with String as the argument is called!!!
					
					Note: In case you have overloaded methods additionally
					with StringBuffer OR StringBuilder as argument, then 
					the compiler will give an error - ambiguous call!!!
					
					""";
		System.out.println(a + "\n");
		
	}	
	
	/*
	//----3b---------
	public static void aMethod(StringBuffer x) {
		
		String a = 	"""
					
					..........Answer...........
					
					The method with StringBuffer as the argument
					is called!!!
					
					""";
		System.out.println(a + "\n");
		
	}
	
	
	
		public static void aMethod(StringBuilder x) {
		
		String a = 	"""
					
					..........Answer...........
					
					The method with StringBuilder as the argument
					is called!!!
					
					""";
		System.out.println(a + "\n");
		
	}
	*/
	
	//----4---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Question...........
					You have 2 overloaded methods with one passing argument is an object.
					For other one the passing argument is a String.
					
					I am passing a null value, calling the overloaded method.
					Which method will be executed, the one with Object OR the one with String?
					
					-------------
					"""; 
		
		System.out.println(x);
		
	}	
	
	
	//--------------
}
