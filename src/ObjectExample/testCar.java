package ObjectExample;

public class testCar {

	public static void main(String[] args) {
		
		// Static polymorphism = compile-time polymorphism
		
		System.out.println("\n-------static polymorphism-------------\n");
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		
		System.out.println("\n---------------------\n");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		// Dynamic polymorphism = run-time polymorphism  = Top Casting
		// Child class object can be referenced by parent class reference variable
		
		System.out.println("\n-------dynamic polymorphism-------------\n");
		
		Car b1 = new BMW();
		b1.start();
		b1.stop();
		b1.refuel();
		//b1.theftSafety();  ---> Can NOT access child methods with dynamic polymorphism!!!
		
		
		
		
	}

}
