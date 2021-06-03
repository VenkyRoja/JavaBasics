package tricky.questions;

public class doubleMINExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===doubleMINExample========================\n");
		
		printProblemStatement();
		
		System.out.println("..........Answer...........\n");
		
		System.out.println("Double.MIN_VALUE          = " + Double.MIN_VALUE + "\n");
		
		System.out.println("Double.NEGATIVE_INFINITY  = " + Double.NEGATIVE_INFINITY + "\n");
		
		System.out.println("Long.MIN_VALUE            = " + Long.MIN_VALUE + "\n");
		
		System.out.println("Integer.MIN_VALUE         = " + Integer.MIN_VALUE + "\n");
		
		System.out.println("Float.MIN_VALUE           = " + Float.MIN_VALUE + "\n");
		
		System.out.println("Minimum value between Double.MIN_VALUE and 0.0d                       = " + Math.min(Double.MIN_VALUE, 0.0d) + "\n");
		
		System.out.println("Minimum value between Integer.MIN_VALUE and 0                         = " + Math.min(Integer.MIN_VALUE, 0) + " = Integer.MIN_VALUE\n");
		
		System.out.println("Minimum value between Double.MIN_VALUE and Float.MIN_VALUE            = " + Math.min(Double.MIN_VALUE, Float.MIN_VALUE) + " = Double.MIN_VALUE \n");
		
		System.out.println("Minimum value between Long.MIN_VALUE and Integer.MIN_VALUE            = " + Math.min(Long.MIN_VALUE, Integer.MIN_VALUE) + " = Long.MIN_VALUE \n");

		System.out.println("Minimum value between Double.MIN_VALUE and Double.NEGATIVE_INFINITY   = " + Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY) + " = Double.NEGATIVE_INFINITY \n");

		
		
		String x = 	"""
					------
					
					    +ve                  +ve                      |        -ve                     -ve                  -ve   
					    Float.MIN_VALUE      Double.MIN_VALUE       0.0d       Integer.MIN_VALUE       Long.MIN_VALUE       -Infinity 
					    --------------------------------->   
					    Big                          Small       
					
					------
					
					(a) Value of Double.MIN_VALUE = 4.9E-324. It is a positive number.
					
					(b) Between Double.MIN_VALUE and 0.0d,  Double.MIN_VALUE is bigger.
					
					(c) Between Double.MIN_VALUE and NEGATIVE_INFINITY,  Double.MIN_VALUE is bigger.
					        
		 			"""; 
		
		System.out.println(x);
		
		System.out.println("\n=================================== End ===doubleMINExample========================\n");

	}
	
	
	//----2---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Questions...........
					
					(a) What is the value of Double.MIN_VALUE?
					
					(b) Double.MIN_VALUE and 0.0d --- which value is bigger?
					
					(c) Double.MIN_VALUE and NEGATIVE_INFINITY --- which value is bigger? 

					-------------
					"""; 
		
		System.out.println(x);
		
	}

}
