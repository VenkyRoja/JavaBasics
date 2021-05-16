package interfaceExample;

public class HSBCBank implements USPolicy, CanadaPolicy { //implementing multiple inheritance of interfaces
	                                                      // Is-a relationship

	//--------1-----------------
	@Override
	public void USCreditRules() {
		
		System.out.println("HSBCBank - USCreditRules");
		
	}

	//--------2-----------------	
	@Override
	public void USDebitRules() {
		
		System.out.println("HSBCBank - USDebitRules");
		
	}

	//--------3-----------------	
	@Override
	public void TransferMoneyRules() {
		
		System.out.println("HSBCBank - TransferMoneyRules");
		
	}

	
	//--------4-----------------	
	public void educationalLoan() {
		
		System.out.println("HSBCBank - educationalLoan");
		
	}
	
	
	//--------5-----------------	
	public void carLoan() {
		
		System.out.println("HSBCBank - carLoan");
		
	}

	//--------6-----------------
	@Override
	public void CanadaMutualFundRules() {
		
		System.out.println("HSBCBank - CanadaMutualFundRules");
		
	}	
	
}
