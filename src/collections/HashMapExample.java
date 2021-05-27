package collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapExample {
		
	public static Map<String, String> M3;
	
	//----static block------start-------
	
	static {
		
		M3 = new HashMap<String, String>();
		M3.put("India","New Delhi");
		M3.put("USA","Washington DC");
		M3.put("Canada","Ottawa");
	}
	
	//----static block------end-----------
	
	
	
	
	//--1-------------------
	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===HashMapExample========================\n");
		
		printDifferencesbetweenHTandHM();
		
		//------a------
		System.out.println("---------------------- Method 1 : Initialization of HashMap using class----");
		
		HashMap<String, String> M1 = new HashMap<String, String>();
		
		Map<String, String> M2 = new HashMap<String, String>();
		
		System.out.println("M1 : " + M1);
		System.out.println("M2 : " + M2);

		
		//------b------
		System.out.println("\n---------------------- Method 2 : Initialization of HashMap using static block----");
		
		System.out.println("India  : " + M3.get("India"));
		System.out.println("Canada : " + M3.get("Canada"));
		System.out.println("USA    : " + M3.get("USA"));
		
		System.out.println("\nStatic block initialization is not preferred! Please avoid it ...");
		
		
		//------c------
		System.out.println("\n---------------------- Method 3 : Initialization of HashMap using immutable map with single entry only----");
		
		Map<String, String> M4 = Collections.singletonMap("Seetha", "Rama");
		
		System.out.println("Seetha  : " + M4.get("Seetha"));
		
		// M4.put("x", "y");    //UnsupportedOperationException
		
		System.out.println("\nYou can NOT add more than one entry to a Singleton map, then \"UnsupportedOperationException\" is raised!");
		System.out.println("You can NOT change the values of the single entry in a Singleton map, it is immutable.");

		
		//------d------
		System.out.println("\n---------------------- Method 4 : Initialization of HashMap using Stream.of and 2D array----JDK 1.8-----");
		
		Map<String, String> M5 = Stream.of(new String[][] {
								  	{"Amma", "Aavu"},
								  	{"Illu", "Eega"}
				                 }).collect(Collectors.toMap(x -> x[0], x -> x[1]));
		
		System.out.println("Amma          : " + M5.get("Amma"));
		System.out.println("Illu          : " + M5.get("Illu"));
		
		M5.put("Aidu paisalu", "Aenugu");  
		
		System.out.println("Aidu paisalu  : " + M5.get("Aidu paisalu"));

		
		//------e------
		System.out.println("\n---------------------- Method 5 : Initialization of HashMap using Stream.of and AbstractMap.SingleEntry----JDK 1.8-----");
		
		Map<String, String> M6 = Stream.of(
									new AbstractMap.SimpleEntry<>("Raja", "Ram"),
									new AbstractMap.SimpleEntry<>("Raghu", "Nandan")
								 ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("Raja          : " + M6.get("Raja"));
		System.out.println("Raghu         : " + M6.get("Raghu"));
		
		M6.put("Vikram", "Simha");  
		
		System.out.println("Vikram        : " + M6.get("Vikram"));

		

		//------f------
		System.out.println("\n---------------------- Method 6 : Initialization of HashMap using Map.of ----JDK 1.9-----");
		
		//....empty map.....
		Map<String, String> M7 = Map.of();
		
		System.out.println("M7 : " + M7);
		
		// M7.put("x", "y");    //UnsupportedOperationException
		
		//....Singleton map.....
		Map<String, String> M8 = Map.of("Radha", "Krishna");
		
		System.out.println("M8 : " + M8);
		
		System.out.println("Radha : " + M8.get("Radha"));
		

		
		//....Multi map 1.....
		Map<String, String> M9 = Map.of("k1", "v1",  "k2", "v2", "k3", "v3", "k4", "v4");
		
		System.out.println("M9 : " + M9 + "    --- Note: Map.of = Maximum of 10 entries only!");
		
		System.out.println("k4 : " + M9.get("k4"));
		
		//M9.put("k5", "v5");    //UnsupportedOperationException
		

		
		//....Multi map 2.....
		Map<String, String> M10 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("Raja", "Ram"),
				new AbstractMap.SimpleEntry<>("Raghu", "Nandan")
			 );
		

		System.out.println("M10 : " + M10 + "       --- Note: Map.ofEntries = There is no limitation on the number of entries!");
		
		System.out.println("Raja : " + M10.get("Raja"));
		
		//M10.put("x", "y"); //UnsupportedOperationException	
		
		
		System.out.println("\nMap.of initializes to an empty map or  singleton map or a multi-map of maximum 10 entries");
		System.out.println("\nMap.ofEntries initializes to a multi-map of no limitation on entries");
		System.out.println("You can NOT add more than one entry to a Singleton map or multimap initialized by Map.of, then \"UnsupportedOperationException\" is raised!");
		System.out.println("You can NOT change the values of the single entry in a Singleton map or multiple entries of multi-map, it is immutable.");
		
		
		System.out.println("\n=================================== End =====HashMapExample========================\n");

	}

	//--2-------------------

	
	//----5----------------
	public static void printDifferencesbetweenHTandHM() {
		
		String x = "..........Differences between HashMap and HashTable........... " + "\n\n" 
		         + "(1) The HashMap class is roughly equivalent to Hashtable, " + "\n"
		         + "    except that HashMap is non-synchronized and permits nulls." + "\n\n"
		         + "(2) HashMap is non-synchronized.  ---  Hashtable is synchronized" + "\n"
				 + "    Hashtable is thread-safe and can be shared between multiple threads. " + "\n"
				 + "    HashMap can not be shared between multiple threads without proper synchronization. " + "\n\n"
				 + "(3) Iterator in the HashMap is  a fail-fast iterator  --- " + "\n"
				 + "    Enumerator for the Hashtable is not fail-fast and throw ConcurrentModificationException " + "\n\n"
				 + "(4) Hashtable is much slower than HashMap if used in Single threaded environment." + "\n\n"
		         + "(5) HashMap does not guarantee that the order of the map will remain constant over time. " + "\n\n" 
				 + "................................ " + "\n";
				
		System.out.println(x + "\n");
		
	}	
	
	//----------------------
}
