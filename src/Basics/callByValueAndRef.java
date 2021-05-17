package Basics;

public class callByValueAndRef {
	
	int p, q, r;

	public static void main(String[] args) {
		
		
		System.out.println("\n=================================== Begin ===callByValueAndRef========================\n");
		
		callByValueAndRef  cvr = new callByValueAndRef();
		
		int x, y, z;
	
		x = 1;
		y = 2;

		
		//---- Call by Value 1 -------
		
		System.out.println("---- Call by value 1 -------\n");
		
		z = cvr.sum(x, y);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("\n");
		
		
		System.out.println("---- Call by value 2 -------\n");
		
		cvr.p = 7;
		cvr.q = 2;
		cvr.r = cvr.sum(cvr.p, cvr.q);
		
		System.out.println("p = " + cvr.p);
		System.out.println("q = " + cvr.q);
		System.out.println("r = " + cvr.r);
		System.out.println("\n");
		
		
		//---- Call by Reference-------
		

		System.out.println("\n---- Call by reference -------\n");
		
		System.out.println("... before ...\n");
		System.out.println("p = " + cvr.p);
		System.out.println("q = " + cvr.q);
		System.out.println("r = " + cvr.r);
		System.out.println("\n");
	
		cvr.sum(cvr);
		
		System.out.println("... after ...\n");
		System.out.println("p = " + cvr.p);
		System.out.println("q = " + cvr.q);
		System.out.println("r = " + cvr.r);
		System.out.println("\n");		
		
		System.out.println("\n=================================== End ===callByValueAndRef========================\n");
		
	}
	
	//----Call by value---------
	public int sum(int x, int y) {
		int z = x + y;
		return z;
	}

	
	//--- Call by reference--------
	public void sum(callByValueAndRef t) {
		t.p += 10;
		t.q += 20;
		t.r = t.p + t.q;
	}	
	
}
