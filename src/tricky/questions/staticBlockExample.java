package tricky.questions;



public class staticBlockExample {
    
	//------------Example of a static block--------------------------//
	static {
		System.out.println("This is static block 1 and will be executed even before main() method." );
	}
		
	
	public static void main(String[] args) {
		System.out.println("\n=================================== Begin ===staticBlockExample========================\n");
		
		printProblemStatement();
		
		System.out.println("..........Answers...........\n");
		
		String x = 	"""
					------
					What is static block in Java?
					
					(1) Static block is a block of code in a class, 
					    denoted by a static keyword and curly braces.
					    Static block is executed even before the main() method.
					    It can be written any where in the class body.
					
					------
					Without making any object, can you run a program in Java?
					(2) Yes, using static blocks and static methods
					    we can run a Java program. The order of execution is 
					    static blocks, main(). If the static methods are called,
					    then those static methods will executed.
					
					------
					What are the differences between a static block and a static method?
					(3) Similarity: The static block and static method, both
					    are static in nature. That means we do NOT need to
					    create an object (using new keyword).
					    
					    Difference: As soon as the class is loaded, static block
					    is executed automatically, where as static method is executed
					    only when called explicitly.
					
					
					------
					If you make the constructor private, can you create an object?
					(4) Yes, we can create the object when there is a private constructor.
					    One option is to use static block and other option is to use static method.
					    
					    Example:
					    
					    ////////////////////////////////////////////////
					    package tricky.questions;

						public class aClass {
							
							int marks;
							
							private aClass() {     //<--- Private constructor of aClass 
								marks = 93;
							}
							
							public static void main(String[] args) {
							      
							}
							
							//-----Option 1: Create a static block and create the object-------
							static {
								aClass X = new aClass();
								System.out.println(X.marks);
							}
		
							//-----Option 2: Create a static method and create the object------ 
							public static int createObject() {
								aClass X = new aClass();
								X.marks = 98;
								return X.marks;
							}
							
							//---------
						}
						
						
						////////////////////////////////////////////////
					    package tricky.questions;

						public class bClass {
							
							public static void main(String[] args) {
							     //aClass A = new aClass();  //<---- can not do this, error - constructor is not visible.
							     
							     int i = aClass.createObject();   //<--- Create the object using static method in aClass
							     System.out.println(i);
							}
						}
					
					------
					Can you compile and run a program without writing a main() method in Java?
					(5) Yes, we can compile and run a program without using a main() method.
					    We may want to use static block.
					    
					    Example:
					    
					    ////////////////////////////////////////////////
					    package tricky.questions;

						public class cClass {
							
							static {
								System.out.println("This is static block in cClass");
							}
						}	
						
						////////////////////////////////////////////////
					    package tricky.questions;

						public class dClass {
							
							public static void main(String[] args) {
							    cClass C = new cClass();  

							}
						}
										
					------
					Can you initialize member variables within the static block?
					(6) Yes, we can initialize member variables within the static block.
					    If it is a static member variable, we can directly.
					    if it is a non-static member variable, we create the object and then
					    access the variable.
					    
					    Example:
					     
					    ////////////////////////////////////////////////
					    package tricky.questions;

						public class eClass {
						
							String name;
							static int marks;
							
							static {
								System.out.println("This is static block in eClass");
								
								eClass E = new eClass();
								E.name = "Raja";
								marks = 97;
								
								System.out.println(E.name + " " + marks);
							}
						}					     
					      
					  
					------
					(7) Will the static block be executed in the following cod?
					
					class Test {
						
						static {
							System.out.println("Test  -- Static block");
								
						}
						public static final int x = 20;
					}	
					  					  				
					public class demo {
						public static void main(String[] args) {
						
							System.out.println(Test.x);
						}
					}
					
					Answer: No, static block will NOT be executed, as the variable is static and final.
					In this case, final static variable stored as a byte code in the caller.
					Static block is not reached in this case.
					
					------
					(8) What will be the output of the following cod?
					
					public class Test {
						
						static {
							System.out.println("Test  -- Static block");
								
						}
						
						{
							System.out.println("Test  -- Initialization block");
								
						}
						
						Test() {
							System.out.println("Test  -- Constructor");
						}
						
						public static void main(String[] args) {
						
							System.out.println("Main Method");
						}
					}
					
					Answer: 
					Test  -- Static block
					Main Method

					------
					(9) What will be the output of the following cod?
					
					public class Test {
						
						static {
							System.out.println("Test  -- Static block");
								
						}
						
						{
							System.out.println("Test  -- Initialization block");
								
						}
						
						Test() {
							System.out.println("Test  -- Constructor");
						}
						
						public static void main(String[] args) {
						
							System.out.println("Main Method");
							new Test();
						}
					}
					
					Answer: 
					Test  -- Static block
					Main Method
					Test  -- Initialization block
					Test  -- Constructor
					

					
		 			"""; 
		
		System.out.println(x);
		
		
		
		System.out.println("\n=================================== End ===staticBlockExample========================\n");

	}
	
	
	//----2---------
	public static void printProblemStatement() {
		
		String x = 	"""
					..........Questions...........
					
					(1) What is static block in Java?
					
					(2) Without making any object, can you run a program in Java?

					(3) What are the differences between a static block and a static method?
					
					(4) If you make the constructor private, can you create an object?
                    
					(5) Can you compile and run a program without writing a main() method in Java?

					(6) Can you initialize member variables within the static block?
					-------------
					"""; 
		
		System.out.println(x);
		
	}
	
	
	//------------Example of static blocks--------------------------//
	static {
		System.out.println("This is static block 2 and will be executed even before main() method." );
	}
		
	
	static {
		System.out.println("This is static block 3 and will be executed even before main() method." );
	}
	
	
	static {
		System.out.println("This is static block 4 and will be executed even before main() method." );
	}
	
	
	//------------Example of a static method--------------------------//
	public static void test() {
		System.out.println("This is static method and will be executed when called." );
	}
	
	//-------------------

 
}

