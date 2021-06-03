package tricky.questions;

public class longNumberExample {

	public static void main(String[] args) {
		System.out.println("\n=================================== Begin ===longNumberExample========================\n");
	
		printProblemStatement();
		
		System.out.println("..........Answer...........\n");
		
		long withoutL = 365*24*60*60*1000;  //seconds in 1000 days
		long withL = 365*24*60*60*1000L;  //seconds in 1000 days
		
		System.out.println("Given number    : 365*24*60*60*1000 \n");
		System.out.println("Answer withoutL : " + withoutL + "\n");
		System.out.println("Answer withL    : " + withL + "\n");
		
		System.out.println("Maximum limit of 32-bit int : " + Integer.MAX_VALUE + "\n");
		
		String x = 	"""
					------
					Why different answer without L?
					
					long with L is a 36-bit number.
					
					long with L is a 32-bit number.
					
					------
					Example:
					
					1471228928  =     1010111101100010010110000000000
					
					31536000000 = 11101010111101100010010110000000000
					  
					Maximum limit of 32-bit int = 2147483647   
					
					31536000000 is greater than maximum limit of 32-bit int.
					Hence Java truncates the 4 significant left most digits, example: 1110	  
					        
		 			"""; 
		
		System.out.println(x);
		
		
		
		System.out.println("\n=================================== End ===longNumberExample========================\n");

	}
	
	
	//----2---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Question...........
					
					What will be the output when you use a long number
					without L and with L?

					-------------
					"""; 
		
		System.out.println(x);
		
	}
	
	//-------------------

}
