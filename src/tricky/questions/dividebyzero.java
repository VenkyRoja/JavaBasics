package tricky.questions;

public class dividebyzero {
	
	public static void main(String [] args) {
		
		System.out.println("\n=================================== Begin ===dividebyzero========================\n");
		
		/* What is the output when divide by zero */
		
		//System.out.println("int / int0      : " + 3/0);       // int / int0        -- Arithmetic Exception
		//System.out.println("int0 /int0      : " + 0/0);       // int0 /int0        -- Arithmetic Exception
		
		System.out.println("float / int0      : " + 3.1f/0);    // float / int0      -- Infinity
		System.out.println("double / int0     : " + 3.1d/0);    // double / int0     -- Infinity
				
		System.out.println("int / double0     : " + 3/0.0);     // int / double0     -- Infinity
		System.out.println("double / double0  : " + 3.69/0.0);  // double / double0  -- Infinity
		
		System.out.println("double0 / double0 : " + 0.0/0.0);   // double0 / double0 -- NaN
		System.out.println("double0 / int0    : " + 0.0/0);     // double0 / int0    -- NaN
		
		System.out.println("\n=================================== End ===dividebyzero========================\n");

	}

}
