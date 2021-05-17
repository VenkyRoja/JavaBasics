package Basics;

public class WrapperClassExample {
	
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===WrapperClassExample========================\n");
		
		//---- 1 String to int conversion
		
		String si = "100";
		System.out.println(si+20);
		
		int i = Integer.parseInt(si);
		System.out.println(i+20);
		

		//---- 2 String to double conversion
		
		String sd = "21.23";
		System.out.println(sd+20.12);
		
		double d = Double.parseDouble(sd);
		System.out.println(d+20.12);
	

		//---- 3 String to boolean conversion
		
		String sb = "true";
		System.out.println(sb);
		
		boolean b = Boolean.parseBoolean(sb);
		System.out.println(b);
	
	
		//---- 4 String to boolean conversion
		
		String sc = "A";               // String - double quotes - "A"
		System.out.println(sc);        // char - single quotes - 'A'
		
		char c = sc.charAt(0);
		System.out.println(c);


		//---- 5 int to String conversion
		
		int j = 27;
		System.out.println(j+9);
		
		String sj = String.valueOf(j);
		System.out.println(sj+9);
		


		//---- 6 double to String conversion
		
		double dx = 27.27;
		System.out.println(dx+9.9);
		
		String sdx = String.valueOf(dx);
		System.out.println(sdx+9.9);
				

		//---- 7 boolean to String conversion
		
		boolean bx = true;
		System.out.println(bx);
		
		String sbx = String.valueOf(bx);
		System.out.println(sbx);
						
		
		//---- 8 character to String conversion
		
		char cx = 'A';
		System.out.println(cx);
		
		String scx = Character.toString(cx);
		System.out.println(scx);
								
		
		System.out.println("\n=================================== End ===WrapperClassExample========================\n");
		
		
	}

}
