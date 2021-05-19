package tricky.questions;

public class printwithoutusingsemicolon {
	
	public static void main(String [] args) {
	
		System.out.println("\n=================================== Begin ===printwithoutusingsemicolon========================\n");
		
		/* Print "Hello World!" without
		 * using a semicolon (;)
		 */

		//---Option 1------
		if (System.out.printf("Hello world!\n") == null) { }
		
		//---Option 2------
		if (System.out.append("Hello world!\n") == null) { }

		//---Option 3------
		if (System.out.append("Hello world!\n").equals(null)) { }	
		
		System.out.println("\n=================================== End ===printwithoutusingsemicolon========================\n");
		
	}
}

