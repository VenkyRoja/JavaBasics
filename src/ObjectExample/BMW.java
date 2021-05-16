package ObjectExample;

public class BMW extends Car {    // has-a relationship
	
	//----1----------
	//Method Overriding = Child class having same method (same name and same arguments) as of parent class
	
	public void start() {                       // Overridden method
		System.out.println("BMW --- start");
	}

	
	//----2----------
	public void theftSafety() {
		System.out.println("Car --- theftSafety");
	}	

}
