package mySingleton;

public class SingletonExample {

	
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===SingletonExample========================\n");
		
		Singleton x = Singleton.getInstance();
		
		Singleton y = Singleton.getInstance();
		
		Singleton z = Singleton.getInstance();

		x.s = x.s.toUpperCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		z.s = x.s.toLowerCase() + " AMMA!";
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		System.out.println("\n=================================== End ===SingletonExample========================\n");
	}

}




