package tricky.questions;

public class integerCaching {

	public static void main(String[] args) {
		
		/*
		 * Integer Caching:
		 * If the Integer is between -128 and 127 
		 * then both will be equal.
		 */
		
		Integer num1, num2;
		
		num1 = -130;
		num2 = -130;
		compare(num1, num2);

		num1 = -128;
		num2 = -128;
		compare(num1, num2);
	
		num1 = 0;
		num2 = 0;
		compare(num1, num2);

		num1 = 100;
		num2 = 100;
		compare(num1, num2);
	
		num1 = 127;
		num2 = 127;
		compare(num1, num2);
	
		num1 = 128;
		num2 = 128;
		compare(num1, num2);
		
		num1 = 12;
		num2 = 18;
		compare(num1, num2);				
		
	}
	
	static void compare(Integer num1, Integer num2) {
		
		if (num1 == num2) {
			System.out.println( num1 + " " + num2 +  " : Both are equal");
		} else {
			System.out.println( num1 + " " + num2 +  " : Both are NOT equal");	
		}
	}

}
