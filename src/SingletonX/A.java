package SingletonX;

public class A {

	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===SingletonExample class A========================\n");
		
		abc x = abc.hello();
		
		abc y = abc.hello();
		
		abc z = abc.hello();

		x.s = x.s.toUpperCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		z.s = x.s.toLowerCase() + " AMMA!";
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		System.out.println("\n=================================== End ===SingletonExample class A========================\n");


	}

}
