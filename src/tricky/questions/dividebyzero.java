package tricky.questions;

public class dividebyzero {
	
	public static void main(String [] args) {
		
		System.out.println("\n=================================== Begin ===dividebyzero========================\n");
		
		/* What is the output when divide by zero */
		
		printProblemStatement();
		
		System.out.println("..........Answer...........\n");
		
		//System.out.println("int / int0      : " + 3/0);       // int / int0        -- Arithmetic Exception
		//System.out.println("int0 /int0      : " + 0/0);       // int0 /int0        -- Arithmetic Exception
		
		System.out.println("3    / 0   : int / int0        : Arithmetic Exception");       // int / int0        -- Arithmetic Exception
		System.out.println("0    / 0   : int0 /int0        : Arithmetic Exception");       // int0 /int0        -- Arithmetic Exception		
		System.out.println();
		
		
		System.out.println("3.1f / 0   : float / int0      : " + 3.1f/0);    // float / int0      -- Infinity
		System.out.println("3.1d / 0   : double / int0     : " + 3.1d/0);    // double / int0     -- Infinity
				
		System.out.println("3    / 0.0 : int / double0     : " + 3/0.0);     // int / double0     -- Infinity
		System.out.println("3.69 / 0.0 : double / double0  : " + 3.69/0.0);  // double / double0  -- Infinity
		System.out.println();
		
		System.out.println("0.0  / 0.0 : double0 / double0 : " + 0.0/0.0);   // double0 / double0 -- NaN
		System.out.println("0.0  / 0   : double0 / int0    : " + 0.0/0);     // double0 / int0    -- NaN
		System.out.println();
		
		System.out.println("..........\n");
		
		String x = 	"""
					(a) when we divide an int by zero int, we get an Arithmetic exception.
					    int  / int0
					    int0 / int0
					
					(b) when we divide an double zero by zero int or double zero , we get NaN.
					    double0 / double0
					    double0 / int0
		 
					(c) when we divide by zero int or double zero , we get infinity.
		 
		 			"""; 
		
		System.out.println(x);
		
		
		
		System.out.println("\n=================================== End ===dividebyzero========================\n");

	}
	
	
	//----2---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Question...........
					
					What is the output when divide by zero in Java?

					-------------
					"""; 
		
		System.out.println(x);
		
	}
	
	//-------------------

}
