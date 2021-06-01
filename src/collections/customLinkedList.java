package collections;

public class customLinkedList {
	
	//Node head;
	
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===customLinkedList========================\n");
		
		myLL LL = new myLL();
		
		System.out.println("My linked list size = " + LL.getSize());
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		
		
		System.out.println("My linked list size = " + LL.getSize());
		
		System.out.println("\nMy linked list:");
		LL.travesreLL();
		
		System.out.println("\n=================================== End  ===customLinkedList========================\n");

	}
}


//=======1================

class Node {
	
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		next = null;
	}
	
}


//=======2================

class myLL {

	Node head;

	//-----1---------------------
	public void add(int data) {
		
		if (getSize() == 0) {
			
			Node n = new Node(data);
			head = n;
			
		} else {
			
			Node last = getLastNode();
			Node n = new Node(data);
			last.next = n;
		}
	}
	
	
	
	//-----2---------------------
	public Node getLastNode() {
		
		
		Node n = head;
		
		while (n != null) {
			
		    if (n.next == null) { return n;}
			n = n.next;
		}
		
		return n;
	}	
	
	
	//-----3---------------------
	public int getSize() {
		
		int k = 0;
		Node n = head;
		
		while (n != null) {
			k++;
			n = n.next;
		}
		
		return k;
	}	
	
	//-----4---------------------
	public void travesreLL() {
		
		Node n = head;
		
		while (n != null) {
			
			if (n.next == null) { System.out.print(n.data); } 
			else { System.out.print(n.data + "  ...  ");}
			
			n = n.next;
			
		}
		System.out.println();
		
	}
	
	//----------------------------
}