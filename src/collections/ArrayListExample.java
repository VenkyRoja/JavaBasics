package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===ArrayListExample========================\n");
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println("Size of the arraylist = " + al.size());
		System.out.println(al.toString());
		
		al.add(400);
		al.add(500);
		
		System.out.println("Size of the arraylist = " + al.size());
		System.out.println(al.toString());
		
		al.add("Raja");
		al.add("Ram");
		al.add(true);
		al.add(21.96);
		al.add('A');
		al.add('X');
		
		System.out.println("Size of the arraylist = " + al.size());
		System.out.println(al.toString());
		
		al.remove(10);

		System.out.println("Size of the arraylist = " + al.size());
		System.out.println(al.toString());
				
		
		System.out.println(al.get(4));
		System.out.println(al.get(6));
		System.out.println(al.get(7));
		System.out.println(al.get(8));
		System.out.println(al.get(9));
		
		
		System.out.println("----------------using a counter in for loop");
		
		for (int i=0; i < al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
		
		
		System.out.println("----------------using iterator in a while loop");
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------using object counter in a for loop");
		
		
		for (Object x : al) {
			System.out.println(x.toString());
		}
		
		System.out.println("----------------");
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		
		ali.add(12);
		ali.add(99);
		ali.add(1212);

		System.out.println("----------------using a counter in for loop");
		
		for (int i=0; i < ali.size(); i++) {
			
			System.out.println(ali.get(i));
		}
		
		
		
		System.out.println("----------------using iterator in a while loop");
		
		Iterator<Integer> itx = ali.iterator();
		
		while (itx.hasNext()) {
			System.out.println(itx.next());
		}
		
		System.out.println("----------------using object counter in a for loop");
		
		
		for (Integer x : ali) {
			System.out.println(x.toString());
		}
		
		System.out.println("----------------");
	
		System.out.println("\n=================================== End ===ArrayListExample========================\n");
		
	}

}
