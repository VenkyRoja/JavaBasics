package interfaceExample;

public class testBank {

	public static void main(String[] args) {
		
		// If a class implements an interface, then that class must 
		// implement / override all the methods of that interface.

		
		// Static polymorphism = compile-time polymorphism
		
		HSBCBank h = new HSBCBank();
		h.USCreditRules();
		h.USDebitRules();
		h.TransferMoneyRules();
		h.educationalLoan();
		h.carLoan();
		h.CanadaMutualFundRules();
		
		// Dynamic polymorphism = run-time polymorphism  = Top Casting
		// Child class object can be referenced by parent interface reference variable
		
		USPolicy h1 = new HSBCBank();
		h1.USCreditRules();
		h1.USDebitRules();
		h1.TransferMoneyRules();
		
		//h1.educationalLoan(); or 
		// h1.carLoan(); ---> Can NOT access child methods with dynamic polymorphism!!!
		
		System.out.println("Minimum balance = " + USPolicy.min_bal);
		

	}

}
