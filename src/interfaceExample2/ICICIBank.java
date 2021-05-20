package interfaceExample2;

public class ICICIBank implements USBank, IndianBank {

	//------1. Coming from IndianBank Interface---------------------
	@Override
	public void educationLoan() {
		
		System.out.println("ICICIBank -- Educational Loan");
		
	}

	@Override
	public void homeLoan() {
		
		System.out.println("ICICIBank -- Home Loan");
		
	}

	@Override
	public void carLoan() {
		
		System.out.println("ICICIBank -- Car Loan");
		
	}

	
	//------2. Coming from USBank Interface---------------------
	@Override
	public void debit() {
		
		System.out.println("ICICIBank -- Debit");
	}

	@Override
	public void credit() {
		
		System.out.println("ICICIBank -- Credit");
		
	}

	@Override
	public void transferMoney() {
	
		System.out.println("ICICIBank -- Transfer Money");
		
	}

	@Override
	public void trading() {
		
		System.out.println("ICICIBank -- Trading");
		
	}
	
	
	//------3 this class methods------------------------
	
	public void mutualFunds() {
		
		System.out.println("ICICIBank -- Mutual Funds");
		
	}
	

	public void insurance() {
		
		System.out.println("ICICIBank -- Insurance");
		
	}
		
	
	

}
