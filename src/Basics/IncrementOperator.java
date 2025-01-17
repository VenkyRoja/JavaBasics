package src.Basics;

public class IncrementOperator {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===IncrementOperator========================\n");
		
		
		int i = 1;
		int j = i++;
		
		System.out.println("Post incremental = increment after assignment");
		System.out.println(i);
		System.out.println(j);
		

		int a = 1;
		int b = ++a	;
		
		System.out.println("Pre incremental = increment before assignment");
		System.out.println(a);
		System.out.println(b);

		System.out.println("\n=================================== End ===IncrementOperator========================\n");
		
	}
	
}
