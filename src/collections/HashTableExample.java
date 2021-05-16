package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("a", "Hello");
		h.put("b", "World!");
		h.put("c", "How");
		h.put("d", "are");
		h.put("e", "you?");

		System.out.println("Size of the Hash = " + h.size());
		System.out.println(h.toString());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);

		System.out.println("Size of the Hash = " + h.size());
		System.out.println(h.toString());
		
		
		System.out.println(h.get(2));
		System.out.println(h.get("b"));
		
		System.out.println("----------------using enumeration ");
				
		Enumeration en = h.keys();
		
		while (en.hasMoreElements()) {
		
			Object key = en.nextElement();
			
			Object val = h.get(key);
			
			System.out.println(key.toString() + " ..... " + val.toString());
		}
		

		System.out.println("----------------using keySet and Set ");
		
		Set st = h.keySet();
		
		for (Object key : st) {
		
			Object val = h.get(key);
			
			System.out.println(key.toString() + " ..... " + val.toString());
		}

	
		
		System.out.println("----------------using keySet and Set, Iterator ");
		
		Set st2 = h.keySet();
		
		Iterator it2 = st2.iterator();
		
		while (it2.hasNext()) {
			
			Object key = it2.next();
		
			Object val = h.get(key);
			
			System.out.println(key.toString() + " ..... " + val.toString());
		}
	
		
		
		System.out.println("----------------using entrySet and Set, Iterator");
		
		Set st3 = h.entrySet();
		
		Iterator it3 = st3.iterator();
		
		while (it3.hasNext()) {
			
			Entry e = (Entry) it3.next();
			
			Object key = e.getKey();
		
			Object val = e.getValue();
			
			System.out.println(key.toString() + " ..... " + val.toString());
		}	
		
		
		
		System.out.println("----------------using forEach");
		
		h.forEach((key, value)-> System.out.println(key.toString() + " ..... " + value.toString()));
		
		  
		
		
		System.out.println("----------------");
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(101, "Ranga");
		h1.put(102, "Rajan");
		h1.put(103, "Soma");
		
	}

}
