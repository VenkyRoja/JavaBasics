package interfaceExample2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===TestBank========================\n");
		
		ICICIBank ic = new ICICIBank();
		
		ic.carLoan();
		ic.educationLoan();
		ic.homeLoan();
		
		ic.credit();
		ic.debit();
		ic.transferMoney();
		ic.trading();
		
		ic.mutualFunds();
		ic.insurance();
		

		System.out.println("Minimum balance = " + USBank.min_bal);
		

		USBank us = new ICICIBank();
		
		us.credit();
		us.debit();
		us.transferMoney();
		us.trading();
		
		System.out.println("\n=================================== End ===TestBank========================\n");
		
		
	}

}
