package src.Basics;

public class Car2 {
	  
	String model;
	String make;
	int    year;

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===Car2========================\n");
		
		
		Car2 a = new Car2();              // new Car() is the object
		Car2 b = new Car2();              // Car is the class on the left hand side
		Car2 c = new Car2();              // a is the reference to the object
		
		                                // new is the key word to create the object
		                                // a, b, c are the object reference variables
		a.model = "Toyota";     
		a.make  = "Corolla";    
		a.year  = 2020;    
		                     
		b.model = "Volkswagon";     
		b.make  = "Jetta";    
		b.year  = 2018;
		
		c.model = "Honda";     
		c.make  = "Civic";    
		c.year  = 2015;
		  
		System.out.println(a.model + " -- " + a.make + " -- " + a.year ); 
		System.out.println(b.model + " -- " + b.make + " -- " + b.year ); 
		System.out.println(c.model + " -- " + c.make + " -- " + c.year ); 
				
		System.out.println("--------Re-assigning Object References---------");
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.model + " -- " + a.make + " -- " + a.year ); 
		System.out.println(b.model + " -- " + b.make + " -- " + b.year ); 
		System.out.println(c.model + " -- " + c.make + " -- " + c.year ); 
		
		System.out.println("\n=================================== End ===Car2========================\n");
		
		
	}
}

