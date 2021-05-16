package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> A = new ArrayList<String>();
		
		A.add("Rama");
		A.add("Seetha");		
		A.add("Hanuma");
		A.add("Lakshmana");
		
		System.out.println("Contents of Array list =  " + A);
		
		System.out.println("--------------------------------------(1) Traversing using forEach");
		
		A.forEach((x) -> System.out.println(x));

		
		System.out.println("--------------------------------------(2) Traversing using Iterator");

		Iterator<String> i = A.iterator();
		
		while (i.hasNext()) {
			
			String x = i.next();
			
			System.out.println(x);
			
		}
		
		System.out.println("--------------------------------------(3) Traversing using for loop");
		
		for (String x : A) {
			
			System.out.println(x);
		}
		

		System.out.println("--------------------------------------(4) Traversing using counter and a for loop");
		
		for (int k = 0; k < A.size(); k++) {
			
			String val = A.get(k);
			
			System.out.println(val);
		}
		
		
		System.out.println("-----------------------------");
		
		
		Student s1 = new Student("Raja", 98, 'A');
		Student s2 = new Student("Rama", 95, 'A');
		Student s3 = new Student("Ranga", 58, 'C');
		Student s4 = new Student("Allaha", 77, 'B');
		Student s5 = new Student("Krishna", 88, 'A');
		
		ArrayList<Student> B = new ArrayList<Student>();
		
		B.add(s1);
		B.add(s2);
		B.add(s3);
		B.add(s4);
		B.add(s5);
		
		System.out.println("Contents of Array list =  " + B);
		
			System.out.println("--------------------------------------(1) Traversing using forEach");
			
			B.forEach((x) -> System.out.println(x.name + "  ...  " + x.marks + "  ...  " + x.grade));
	
			
			System.out.println("--------------------------------------(2) Traversing using Iterator");
	
			Iterator<Student> p = B.iterator();
			
			while (p.hasNext()) {
				
				Student x = p.next();
				
				System.out.println(x.name + "  ...  " + x.marks + "  ...  " + x.grade);
				
			}
			
			System.out.println("--------------------------------------(3) Traversing using for loop");
			
			for (Student x : B) {
				
				System.out.println(x.name + "  ...  " + x.marks + "  ...  " + x.grade);
			}
			
	
			System.out.println("--------------------------------------(4) Traversing using counter and a for loop");
			
			for (int k = 0; k < B.size(); k++) {
				
				Student x = B.get(k);
				
				System.out.println(x.name + "  ...  " + x.marks + "  ...  " + x.grade);
			}
			
			
			System.out.println("-----------------------------");
		

		
		ArrayList<String> C = new ArrayList<String>();
		
		C.add("Bharatha");
		C.add("Sathrugna");
		
		System.out.println("Contents of Array list =  " + A);
		System.out.println("Contents of Array list =  " + C);
		
		A.addAll(C);
		
		System.out.println("Contents of Array list =  " + A);

		System.out.println("--------------------------------------(1) Traversing using forEach");
		
		A.forEach((x) -> System.out.println(x));
		
		System.out.println("-----------------------------");
		
		
	}

}
