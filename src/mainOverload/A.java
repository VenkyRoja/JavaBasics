package mainOverload;

public class A {
    
	public static void main(String[] args) {
		
		
		
		System.out.println("Message A");
		
		try {
			
			throw new Exception("Raja's exception");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Message B");
		
		
		System.out.println("\n=================================== Begin ===mainMethodOverloading -- Class A========================\n");
		
		System.out.println("This is main method of Class A");
		
		B.main(args);
		
		//mainMethodOverloading.main(args);
		
		//mainMethodOverloading.main(10);
		
		//mainMethodOverloading.main(20, 30);
		
		//mainMethodOverloading.main("Raja");	
		
		
		
		System.out.println("\n=================================== End ===mainMethodOverloading -- Class A========================\n");

		
		System.out.println("\n after handling the exception...");
	
	
	}
	


}
