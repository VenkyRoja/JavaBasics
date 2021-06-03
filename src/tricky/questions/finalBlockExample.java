package tricky.questions;

public class finalBlockExample {

	public static void main(String[] args) {
		System.out.println("\n=================================== Begin ===finalBlockExample========================\n");
		
		printProblemStatement();
		
		System.out.println("..........Answer...........\n");
		
		System.out.println("Case 1:\n");
		System.out.println("aClass.x = " + aClass.x);
		
		System.out.println("\nCase 2:\n");
		System.out.println("bClass.x = " + bClass.x);
		
		System.out.println("..........\n");
		
		String x = 	"""
					
					Case 1: 
					--A final static variable and a static block--
					In this case, final static variable stored as a byte code in the caller.
					Static block is not reached in this case.
					
					Answer: The static block will not be executed.
					-----
										
					Case 2: 
					--A static variable and a static block--
					In this case, the control goes to class and reaches the static block first.
					Then it reaches the static variable.
					
					Answer: The static block will be executed and then static variable is printed.
					------
					  
		 			"""; 
		
		System.out.println(x);
		
		
		
		System.out.println("\n=================================== End ===finalBlockExample========================\n");

	}
	
	
	//----2---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Question...........
					
					A class has final static variable and a static block.
					The main class is printing the static variable.
					Will the static block be executed?

					A class has static variable (no final) and a static block.
					The main class is printing the static variable.
					Will the static block be executed?

					-------------
					"""; 
		
		System.out.println(x);
		
	}
	
	//-------------------


}

//============2=================================
class aClass {
	
	public static final int x  = 81;
	
	//----Static Block-------------
	static {
		System.out.println("Static block in aClass");
	}	
	//------------------------------
	
	
}


//============3=================================
class bClass {
	
	public static int x  = 81;
	
	//----Static Block-------------
	static {
		System.out.println("Static block in bClass");
	}	
	//------------------------------
	
	
}
