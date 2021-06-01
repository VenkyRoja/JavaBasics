package collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {
	
	enum A {
		Rama,
		Seetha,
		Lakshmana,
		Hanuma,
		Krishna,
		Radha
	}
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===EnumSetExample========================\n");
		
		EnumSet<A> X = EnumSet.allOf(A.class);
		
		EnumSet<A> E = EnumSet.noneOf(A.class);
		
		EnumSet<A> R = EnumSet.range(A.Hanuma, A.Radha);
		
		EnumSet<A> Y = EnumSet.of(A.Hanuma);

		EnumSet<A> Z = EnumSet.of(A.Hanuma, A.Rama);	
		
		System.out.println("EnumSet, X : " + X + "\n");
		System.out.println("EnumSet, E : " + E + "\n");
		System.out.println("EnumSet, R : " + R + "\n");		
		System.out.println("EnumSet, Y : " + Y + "\n");			
		System.out.println("EnumSet, Z : " + Z + "\n");		
		
		System.out.println("----------");
		
		EnumSet<A> X1 = EnumSet.allOf(A.class);
		EnumSet<A> E1 = EnumSet.noneOf(A.class);   
		
		System.out.println("EnumSet, X1 : " + X1 + "\n");
		System.out.println("EnumSet, E1 : " + E1 + "\n");	
		
		E1.add(A.Rama);
		
		System.out.println("EnumSet, E1 : " + E1 + "\n");
		
		E1.addAll(X1);
		
		System.out.println("EnumSet, E1 : " + E1 + "\n");
		
		System.out.println("----------");
		
		X.forEach((x) -> System.out.print(x + " ... ") );
		System.out.println();
		
		Iterator<A> it = X.iterator();
		while (it.hasNext()) {
			A a = it.next();
			System.out.print(a + " ... ");
		}
		System.out.println();
		
		System.out.println("\n=================================== End =====EnumSetExample========================\n");		

		

	}

}
