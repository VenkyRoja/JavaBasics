package tricky.questions;

public class integerCaching {

	//-----1-----------
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===integerCaching========================\n");
		
		/*
		 * Integer Caching:
		 * If the Integer is between -128 and 127 
		 * then both will be equal.
		 */
		
		
		printProblemStatement();
		
		
		System.out.println("..........Answer...........\n");
		
		Integer num1, num2;
		
		num1 = 100;
		num2 = 100;
		compare(num1, num2);

		num1 = 128;
		num2 = 128;
		compare(num1, num2);	

		num1 = -128;
		num2 = -128;
		compare(num1, num2);
	
				
		//-----
		System.out.println("..........\n");
		
		System.out.println("Out of bound cases --- > 127\n");
		
		num1 = 128;
		num2 = 128;
		compare(num1, num2);	

		num1 = 130;
		num2 = 130;
		compare(num1, num2);	

		num1 = 1000;
		num2 = 1000;
		compare(num1, num2);	
		

		System.out.println("In bound cases --- between -128 and 127\n");

		num1 = -128;
		num2 = -128;
		compare(num1, num2);

		num1 = -10;
		num2 = -10;
		compare(num1, num2);
		
		
		num1 = 0;
		num2 = 0;
		compare(num1, num2);

		num1 = 101;
		num2 = 101;
		compare(num1, num2);

		num1 = 127;
		num2 = 127;
		compare(num1, num2);		
		
		num1 = 12;
		num2 = 18;
		compare(num1, num2);	
		
		
		System.out.println("Out of bound cases --- < -128\n");
		num1 = -130;
		num2 = -130;
		compare(num1, num2);		
		
		num1 = -129;
		num2 = -129;
		compare(num1, num2);		
		
		System.out.println("..........\n");
		
		String x = 	"""
					The inequality is due to Integer caching.
					
					Integer Caching:
					If the Integer is between -128 and 127 
					then both will be equal
					else they will not be equal.
		 
		 			"""; 
		
		System.out.println(x);
				
		
		System.out.println("\n=================================== End ===integerCaching========================\n");
		
	}
	
	
	//-----2----------
	static void compare(Integer num1, Integer num2) {
		
		if (num1 == num2) {
			System.out.println( num1 + " " + num2 +  " : Both are equal\n");
		} else {
			System.out.println( num1 + " " + num2 +  " : Both are NOT equal\n");	
		}
	}
	
	
	//----3---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Question...........
					You have 2 Integers having the values: 100 and 100.
					If you compare, will they be equal?
					
					You have 2 Integers having the values: 128 and 128.
					If you compare, will they be equal?
					
					
					You have 2 Integers having the values: -129 and -129.
					If you compare, will they be equal?
					
					Why?
					
					-------------
					"""; 
		
		System.out.println(x);
		
	}
	
	//-------------------

}
