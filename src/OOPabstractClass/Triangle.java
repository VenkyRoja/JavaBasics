package OOPabstractClass;

public class Triangle extends Shape {
	
	
	public static void main(String[] args) {
	
		System.out.println("\n=================================== Begin ===Triangle========================\n");
		
		Shape s = new Triangle();
		s.drawing();
		s.fill();
		
		Triangle t = new Triangle();
		t.fill();
		
		System.out.println("\n=================================== End ===Triangle========================\n");
		
	}

	@Override
	void drawing() {
		System.out.println(" Triangle - drawing ");
		
	}
	
	Triangle() {
		System.out.println(" Constructor - Triangle ");
		
	}
	

}
