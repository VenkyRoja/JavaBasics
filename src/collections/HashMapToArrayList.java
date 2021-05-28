package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {

	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===hmHTsmCHM========================\n");
		
		HashMap<String, String> M = new HashMap<String, String>();
		
		M.put("India",  "New Delhi");
		M.put("Canada", "Ottawa");
		M.put("USA",    "Washington DC");
		M.put("UK",     "London");
		M.put("Japan",  "Tokyo");
		
		System.out.println("M : " + M + "\n");
		
		M.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");

		List<String> X = new ArrayList<String>(M.keySet()); 
		
		List<String> Y = new ArrayList<String>(M.values());
		
		X.forEach((d) -> System.out.print(d + " ... ")); System.out.println("\n");
		
		Y.forEach((d) -> System.out.print(d + " ... ")); System.out.println("\n");
				
		System.out.println("\n=================================== End =====hmHTsmCHM========================\n");		

	}

}
