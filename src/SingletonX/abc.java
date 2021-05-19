package SingletonX;


public class abc {

	
	private static abc x = null;
	public String s;
	
	
	//----1-------------------
	private abc() {

		s = "This is a singleton class!!! ";
		
		//abc class is a singleton class
	}
	
	
	//----2-------------------
	public static abc hello() {
		
		if (x == null) {
			
			x = new abc();
		}
		
		return x;
		
	}
	
	
}
