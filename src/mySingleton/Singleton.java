package mySingleton;

public class Singleton {
	
	/*
	 
	 ---------------------------------------------------------
	 A singleton is a class 
	 
	 (a) that can have only one object instantiated at a time
	 
	 To achieve a singleton class in Java
	 
	   (1) Make the constructor private
	
	   (2) Write a public static method return type of object
	       is this singleton class  ---- Lazy initialization
	       
	 ---------------------------------------------------
	   
	 */
	
	private static Singleton singletoInstance = null;
	public String s;
	
	
	//----1-------------------
	private Singleton() {

		s = "This is a singleton class pattern";
		
		String x =  "\n ---------------------------------------------------------\n "
				 +  "A singleton is a class \n\n"
				 +  "(a) that can have only one object instantiated at a time\n\n"
				 +  "To achieve a singleton class in Java \n\n"
				 +  "  (1) Make the constructor private \n\n"
				 +  "  (2) Write a public static method return type of object \n"
				 +  "      is this singleton class  ---- Lazy initialization \n\n"
				 +  "\n ---------------------------------------------------------\n ";
		
		System.out.println(x);
		
	}
	
	
	//----2-------------------
	public static Singleton getInstance() {
		
		if (singletoInstance == null) {
			
			singletoInstance = new Singleton();
		}
		
		return singletoInstance;
		
	}
	
	
	

}
