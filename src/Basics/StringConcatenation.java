package Basics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===StringConcatenation========================\n");
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World!";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);  //**important**
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println("\n=================================== End ===StringConcatenation========================\n");
		
	}

}
