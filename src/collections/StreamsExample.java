package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;



public class StreamsExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===StreamsExample========================\n");
		
		
		/*................................1.....................................*/
		System.out.println("-- JDK 1.8 Features----");
		System.out.println("    Stream.of  filter       forEach");
		System.out.println("    Stream.of  map          forEach");
		System.out.println("    Optional   ofNullable   isPresent");
		System.out.println("    Optional   empty        isPresent\n");
		/*................................1.....................................*/
		
		//--1a--Stream---//
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2==0).forEach(e -> System.out.println(e));
		
		System.out.println();
		
		//--1b--Stream---//
		Stream.of("Hi", "Hello")
			  .map(e -> e + ", King!")
			  .forEach(System.out::println);
		
		System.out.println();
		
		//--1c--Optional class---//
		String s[] = new String[5];
		//System.out.println(s[2].length());   //gives a NullPointerException
		
		Optional<String> x = Optional.ofNullable(s[2]);
		
		if (x.isPresent()) {
			System.out.println(s[2] + " ... " + s[2].length());
		} else {
			System.out.println("value is not present!");
		}
		
		s[2] = "Arjuna";
		Optional<String> y = Optional.ofNullable(s[2]);
		y.ifPresent(e -> System.out.println(e + " ... " + e.length()));

		//--1d--Optional class---//
		Optional<String> z = Optional.empty();   // z is now an empty object
		z.ifPresent(e -> System.out.println(e + " ... " + e.length()));	
		
		System.out.println();
		
		/*................................2.....................................*/
		System.out.println("-- JDK 1.9 Features----");
		System.out.println("    jShell  --enable-preview");
		System.out.println("    Factory methods for immutable collections");
		System.out.println("       List.of\n");
		/*................................2.....................................*/
		
		List<Integer> P = Arrays.asList(1,2,3,4,5);                            // old method of declaring
		
		//--2a--List.of---//
		List<String> Q = List.of("Rama", "Seetha", "Lakshamana", "Hanuma");    // new method of declaring
		
		P.forEach((a) -> System.out.print(a + "  ...  ")); System.out.println();
		Q.forEach((a) -> System.out.print(a + "  ...  ")); System.out.println();
		
		
		/*................................3.....................................*/
		System.out.println("\n-- JDK 1.10 Features----");
		System.out.println("    var keyword -- no strict data typing\n");	
		/*................................3.....................................*/
		
		//--3a--var keyword---//
		int g = 10;             //old way of declaring
		String sg = "Rama";     //old way of declaring
		System.out.println(g + "   " + sg);
		
		//--3a.1
		var gx = 10;          // this is an int
		var gs = "10";        // this is a string
		
		System.out.println(gx + 21);
		System.out.println(gs + 21);
		
		//Set<String> H = new HashSet<String>();    //old way of declaring
		
		//--3a.2
		var H = new HashSet<String>();              // this is a Hash Set
		    
		H.add("USA");
		H.add("India");
		H.add("Canada");
		H.add("UK");
		H.add("Japan");
		
		System.out.println("HashSet : " + H + "\n");
		
		
		H.forEach((l) -> System.out.print(l + "  ...  "));
		System.out.println();
		
		System.out.println("Does hash set contains USA? " + H.contains("USA"));
		
		//--3a.2
		var M = new ArrayList<Integer>();      // this is a Array List
		
		M.add(12);
		M.add(99);
		M.add(1212);
		
		System.out.println("\nArrayList : " + M );
		M.forEach((l) -> System.out.print(l + "  ...  "));
		
	
		System.out.println("\n----------");
		
		/*................................4.....................................*/
		System.out.println("\n-- JDK 1.11 Features----");
		System.out.println("    Single Source File Launch\n");	
		/*................................4.....................................*/
		
		
		/*................................5.....................................*/
		System.out.println("\n-- JDK 1.12 Features----");
		System.out.println("    new switch case statement\n");	
		/*................................5.....................................*/
		
		//-----Old way--------------//
		String ss = "chrome";
		
		switch (ss) {
		case "chrome":
			System.out.println("chrome");
			break;
		case "ff":
			System.out.println("mozilla");
			break;
		case "edge":
			System.out.println("microsoft edge");
			break;
		default:
			System.out.println("none");
			break;
		}
		
		//-----New way--------------//
		
		var i = 1;
		
		var j = switch (i) {
		case 1 -> "chrome";
		case 2 -> "ff";
		case 3 -> "edge";
		default -> "none";
		};	
		
		System.out.println(j);
		
		System.out.println("\n----------");
		
		
		/*................................5.....................................*/
		System.out.println("\n-- JDK 1.13 Features----");
		System.out.println("    multi-line string   (Examples: JSON, xml, paragraph text)\n");	
		/*................................5.....................................*/
				
		
		var response = """
				       {
				          "name" : "Raja",
				          "marks" : "98",
				          "class" : "B Eng"   
				       }
				       """;
		
		System.out.println("\n----------");
		System.out.println(response);
		
		var mytext = """
					-- JDK 1.8 Features----
						Stream.of  filter       forEach
						Stream.of  map          forEach
						Optional   ofNullable   isPresent
						Optional   empty        isPresent

					-- JDK 1.9 Features----
						jShell  --enable-preview
						Factory methods for immutable collections
							List.of

					-- JDK 1.10 Features----
						var -- no strict data typing


					-- JDK 1.11 Features----
						Single Source File Launch

					-- JDK 1.12 Features----
						new switch case statement

					-- JDK 1.13 Features----
						multi-line string (Examples: JSON, xml, paragraph text)
						
					-- JDK 1.14 Features----
						record keyword for data classes		
						instanceOf 				
			       """;
		
		System.out.println("\n----------");
		System.out.println(mytext);
		
		System.out.println("\n----------");
		
		
		/*................................6.....................................*/
		var text1 = """
					-- JDK 1.14 Features----
						record keyword for data classes
						instanceOf 
	       			""";
		System.out.println(text1);
		/*................................6.....................................*/
		
		myStudent ms = new myStudent("Krishna", 97, "M Eng");
		System.out.println(ms.name() + "  " + ms.marks() + "   " + ms.myClass());
		
		System.out.println("\n=================================== End ====StreamsExample========================\n");
		
		
	}

	
}


