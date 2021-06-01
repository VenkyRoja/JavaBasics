package collections;


import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===VectorExample========================\n");
		
		Vector<String> V = new Vector<String>();
		
		V.add("USA");
		V.add("India");
		V.add("Canada");
		V.add("UK");
		V.add("Japan");
		
		System.out.println("V : " + V + "\n");
		
		V.forEach((x) -> System.out.print(x + "  ...  "));
		System.out.println();
		
		System.out.println("Value at 2nd index = " + V.get(2));
		
		System.out.println("\n=================================== End =====VectorExample========================\n");		


	}

}
