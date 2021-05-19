package tricky.questions;

public class printwithoutusingNumbers {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===printwithoutusingNumbers========================\n");
		
		/* Print 1 to 100
		 * without using any numbers
		 * for counting
		 */

		
		int one = 'A'/'A';
		String ten = "ABCDEFGHIJ";
		
		int hundred = ten.length() * ten.length();
		
		//--1-- Using String length-------
		System.out.println("-- Using String length-----");
		for (int i = one; i <= hundred; i++) {	
			System.out.print(i + " ");
		}
		System.out.println();

		
		//--2-- Using ASCII values in int -------
		//ASCII a = 97, b = 98, c = 99, d = 100
		System.out.println("-- Using ASCII value of d----");
		for (int i = one; i <= 'd'; i++) {	
			System.out.print(i + " ");
		}
		System.out.println();		
		
		System.out.println("\n=================================== End ===printwithoutusingNumbers========================\n");
	}

}
