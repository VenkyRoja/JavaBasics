package OOPabstractClass;

public class Triangle extends Shape {
	
	public static void main(String[] args) {
		
		Shape s = new Triangle();
		s.drawing();
		s.fill();
		
		Triangle t = new Triangle();
		t.fill();
		
	}

	@Override
	void drawing() {
		System.out.println(" Triangle - drawing ");
		
	}
	
	Triangle() {
		System.out.println(" Constructor - Triangle ");
		
	}
	

}
