package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class hmHTsmCHM {

	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===hmHTsmCHM========================\n");
		
		printDifferencesbetweenhmHTsmCHM();
		
		//------a------
		System.out.println("\n---------------------- 1 : HashMap----");
		
		HashMap<String, String> M = new HashMap<String, String>();
		
		M.put("amma", "aavu");
		M.put("illu", "eega");
		M.put("aidu", "airavatham");
		M.put("Onte", "ooda");
		
		System.out.println("M : " + M + "\n");
		
		M.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");

		
		//------b------
		System.out.println("\n---------------------- 2 : SynchronizedMap----");
		
		Map<String, String> S = Collections.synchronizedMap(new HashMap<String, String>());
		
		S.put("amma", "aavu");
		S.put("illu", "eega");
		S.put("aidu", "airavatham");
		S.put("Onte", "ooda");	
		
		System.out.println("S : " + S + "\n");
		
		S.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");
	
		
		//------c------
		System.out.println("\n---------------------- 3 : HashTable----");
		
		Hashtable<String, String> H = new Hashtable<String, String>();
		
		H.put("amma", "aavu");
		H.put("illu", "eega");
		H.put("aidu", "airavatham");
		H.put("Onte", "ooda");
		
		System.out.println("H : " + H + "\n");
		
		H.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");

		
		//------d------
		System.out.println("\n---------------------- 4 : ConcurrentHashMap----");
		
		ConcurrentHashMap<String, String> C = new ConcurrentHashMap<String, String>();
		
		C.put("amma", "aavu");
		C.put("illu", "eega");
		C.put("aidu", "airavatham");
		C.put("Onte", "ooda");
		
		System.out.println("C : " + C + "\n");
		
		C.forEach((k, v)-> System.out.println(k + " ..... " + v));
		System.out.println("\n");

		
		
		System.out.println("\n=================================== End =====hmHTsmCHM========================\n");

	}

	//--2-------------------

	
	//----5----------------
	public static void printDifferencesbetweenhmHTsmCHM() {
		
		String x = "..........Differences between HashMap, HashTable, SyncronizedMap and ConcurrentHashMap........... " + "\n\n" 
		
		         + "(1) HashMap:" + "\n"
		         + "     -- Not synchronized (not thread safe)" + "\n"
		         + "     -- One null key allowed" + "\n"
		         + "     -- Multiple null values allowed" + "\n"
		         + "     -- introdueced in JDK 1.5" + "\n"
		         + "     -- no locking mechanism" + "\n\n"
		         
		         + "(2) HashTable:" + "\n"
		         + "     -- Synchronized (Thread safe)" + "\n"
		         + "     -- No null key allowed" + "\n"
		         + "     -- No null values allowed" + "\n"
		         + "     -- Slower performance" + "\n"
		         + "     -- introdueced in JDK 1.2" + "\n"
		         + "     -- Object level locking" + "\n\n"
		             
		         + "(3) SynchronizedMap:" + "\n"
		         + "     -- Synchronized (Thread safe)" + "\n"
		         + "     -- One null key allowed" + "\n"
		         + "     -- Multiple null values allowed" + "\n"
		         + "     -- Object level locking" + "\n\n"
		         
 				 + "(4) ConcurrentHashMap:" + "\n"
 				 + "     -- Synchronized (Thread safe)" + "\n"
  				 + "     -- No null key allowed" + "\n"
  				 + "     -- No null values allowed" + "\n"
 				 + "     -- Fast performance" + "\n"
 				 + "     -- introdueced after JDK 1.5" + "\n"
 				 + "     -- by default divides map into 16 segments" + "\n"
 				 + "     -- sement level locking" + "\n"
 				 + "     -- multiple read opeartions" + "\n"
 				 + "     -- single write operation" + "\n"
 				 + "     -- Does not throw ConcurrentModificationException"+ "\n\n"
 				 
 				 + "ConcurrentHashMap is the PREFERRED hashmap!!!" + "\n\n"
			     
 				 + "................................ " + "\n";
				
		System.out.println(x + "\n");
		
	}	
	
	//----------------------

}
