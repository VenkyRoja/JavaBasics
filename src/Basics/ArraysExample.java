package src.Basics;

public class ArraysExample {

	public static void main(String[] args) {
	
		System.out.println("\n=================================== Begin ===ArraysExample========================\n");
		
		//-----1-------
		int i[] = new int[4];
		i[0]= 10;
		i[1] = 22;
		i[2] = 11;
		i[3] = 3;

		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);

		for (int j=0; j < i.length; j++) {
		   System.out.println(i[j]);
		}
		
		//-----2-------
		double d[] = new double[3];
		d[0]= 10.1;
		d[1] = 21.234;
		d[2] = 11.12;

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d.length);

		for (int j=0; j < d.length; j++) {
		   System.out.println(d[j]);
		}
		
		
		//-----3-------
		char c[] = new char[3];
		c[0]= 'a';                     //Single quotes for char in Java !!!

		c[1] = '#';
		c[2] = '2';

		System.out.println(c[2]);
		System.out.println(c[0]);
		System.out.println(c.length);

		for (int j=0; j < c.length; j++) {
		   System.out.println(c[j]);
		}		
		
		
		//-----4-------
		boolean b[] = new boolean[2];
		b[0]= true;
		b[1] = false;

		System.out.println(b[1]);
		System.out.println(b[0]);
		System.out.println(b.length);

		
		//-----5-------
		String s[] = new String[3];
		s[0]= "Hello,   ";              //Double quotes for String in Java !!!
		s[1] = "World!";
		s[2] = "How are you?";


		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s.length);

		//s[3] = "How are you?";    //ArrayIndexOutOfBoundsException
		
		
		//-----6-------

		Object ob[] = new Object[6];    //Object Array --- different data tyoes
		ob[0]= "Raja";
		ob[1] = "12/31/2000";
		ob[2] = 36;
		ob[3] = true;
		ob[4] = 71.19;
		ob[5] = 'A';

		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println(ob.length);

		for (int j=0; j < ob.length; j++) {
		   System.out.println(ob[j]);
		}

		
		//-----7-------
		String x[][] = new String[3][5];           //Two dimensional array (2D array)

		int rows = x.length;        // # of rows
		int cols = x[0].length;     // # of columns

		System.out.println("# of rows    = " + rows);
		System.out.println("# of columns = " + cols);

		x[0][0] = "A-0";
		x[0][1] = "B-0";
		x[0][2] = "C-0";
		x[0][3] = "D-0";
		x[0][4] = "E-0";

		x[1][0] = "A-1";
		x[1][1] = "B-1";
		x[1][2] = "C-1";
		x[1][3] = "D-1";
		x[1][4] = "E-1";

		x[2][0] = "A-2";
		x[2][1] = "B-2";
		x[2][2] = "C-2";
		x[2][3] = "D-2";
		x[2][4] = "E-2";


		System.out.println(x[2][4]);
		System.out.println(x[0][2]);

		for (int j=0; j < rows; j++) {
			for (int k=0; k < cols; k++) {   
				System.out.print(x[j][k] + "  ");
			}
			System.out.println();
		}

		
		System.out.println("\n=================================== End ===ArraysExample========================\n");
		//---------------

	}

}
