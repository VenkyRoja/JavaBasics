package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===HashSetExample========================\n");
		
		Set<String> H = new HashSet<String>();
		
		H.add("USA");
		H.add("India");
		H.add("Canada");
		H.add("UK");
		H.add("Japan");
		
		System.out.println("HashSet : " + H + "\n");
		
		H.forEach((x) -> System.out.print(x + "  ...  "));
		System.out.println();
		
		System.out.println("Does hash set contains USA? " + H.contains("USA"));
		
		System.out.println("\n----------");
		
		HashSet <Integer> A = new HashSet<Integer>();
		HashSet <Integer> B = new HashSet<Integer>();
		
		A.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,11}));
		B.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6,8,10,12}));
		
		HashSet <Integer> U = new HashSet<Integer>(A);
		HashSet <Integer> I = new HashSet<Integer>(A);
		HashSet <Integer> D = new HashSet<Integer>(A);
		
		U.addAll(B);
		
		I.retainAll(B);
		
		D.removeAll(B);
		
		System.out.println("\nA : " + A);
		System.out.println("B : " + B + "\n");
		
		System.out.println("A Union B        : " + U );
		System.out.println("A Interscetion B : " + I );
		System.out.println("A Difference B   : " + D + "\n");
		
		System.out.println("----------");
		
		
		
		System.out.println("\n=================================== End =====HashSetExample========================\n");		

	}

}
