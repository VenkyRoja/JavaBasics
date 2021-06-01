package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===TreeMapExample========================\n");
		
		TreeMap<String, String> T = new TreeMap<String, String>();
		
		T.put("USA",    "Washington DC");
		T.put("India",  "New Delhi");
		T.put("Canada", "Ottawa");
		T.put("UK",     "London");
		T.put("Japan",  "Tokyo");
		
		System.out.println("T : " + T + "\n");
		
		T.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");

		System.out.println("First Key = " + T.firstKey());
		System.out.println("Last Key = " + T.lastKey());
		System.out.println("\n");
		
		Set<String> CountriesLessThan_J = T.headMap("Japan").keySet();
		System.out.println("Countries less than J = " + CountriesLessThan_J);
		System.out.println("\n");

		Set<String> CountriesMoreThan_J = T.tailMap("Japan").keySet();
		System.out.println("Countries greater than J = " + CountriesMoreThan_J);
		System.out.println("\n");
		
		System.out.println("---------------------");
		
		TreeMap<String, Integer> X = new TreeMap<String, Integer>();
		
		X.put("USA",    1);
		X.put("India",  5);
		X.put("Canada", 9);
		X.put("UK",     2);
		X.put("Japan",  11);
		
		System.out.println("X : " + X + "\n");
		
		X.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");	

		System.out.println("---------------------");
		
		TreeMap<String, Integer> Y = new TreeMap<String, Integer>(Comparator.reverseOrder());
		
		Y.put("USA",    1);
		Y.put("India",  5);
		Y.put("Canada", 9);
		Y.put("UK",     2);
		Y.put("Japan",  11);
		
		System.out.println("Y : " + Y + "\n");
		
		Y.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");	
	
		
		
		System.out.println("\n=================================== End =====TreeMapExample========================\n");		
		
		
		
	}

}
