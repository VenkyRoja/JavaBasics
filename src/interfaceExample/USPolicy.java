package interfaceExample;

public interface USPolicy {
	
	int min_bal = 100;
	
	public void USCreditRules();
	
	public void USDebitRules();
	
	public void TransferMoneyRules();

	
	/*
	 
	 /---------------------------------------------\
	 |                                             | 
     |     In interface:                           |
     |	                                           |
	 |		• There is only method declaration     |
	 |		• There is NO method body              |
	 |		• Static methods are NOT valid         |
	 |		• No main method                       |
	 |                                             |
	 |		• Variable declaration is valid        |
	 |		• By default variables are static      |
	 |		• Variable values can not be changed   |
	 |        - final/constant in nature           |
	 |                                             |
	 |      • Interfaces are abstract -- we        |  
     |        can not  create object               |
	 |        of the interface                     |
     |                                             |
	 \---------------------------------------------/
	 
	 
	 */
	
	
}
