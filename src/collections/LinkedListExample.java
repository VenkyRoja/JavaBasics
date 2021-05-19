package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===LinkedListExample========================\n");
		
		LinkedList<String> A = new LinkedList<String>();
		
		A.add("Rama");
		A.add("Seetha");		
		A.add("Hanuma");
		A.add("Lakshmana");	
		
		System.out.println("Contents of linked list =  " + A);
		
		A.addFirst("Krishna");
		A.addLast("Ranga");
		
		System.out.println("Contents of linked list =  " + A);
		
		System.out.println(A.get(0));
		System.out.println(A.get(3));
		System.out.println(A.get(5));
		
		System.out.println("...Before... ");
		System.out.println(A.get(1));
		System.out.println(A.get(2));
		
		A.set(1, "Maha Vishnu");
		A.set(2, "Lakshmi");

		System.out.println("...After... ");
		System.out.println(A.get(1));
		System.out.println(A.get(2));
				
		System.out.println("Contents of linked list =  " + A);
		
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
		
		LinkedList<Student> B = new LinkedList<Student>();
		
		B.add(s1);
		B.add(s2);
		B.add(s3);
		B.add(s4);
		B.add(s5);
		
		System.out.println("Contents of Linked list =  " + B);
		
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
		

		
		LinkedList<String> C = new LinkedList<String>();
		
		C.add("Bharatha");
		C.add("Sathrugna");
		
		System.out.println("Contents of Linked list =  " + A);
		System.out.println("Contents of Linked list =  " + C);
		
		A.addAll(C);
		
		System.out.println("Contents of Linked list =  " + A);

		System.out.println("--------------------------------------(1) Traversing using forEach");
		
		A.forEach((x) -> System.out.println(x));
		
		System.out.println("-----------------------------");
		
		System.out.println("\n=================================== End ===LinkedListExample========================\n");
		
	}
		

}
