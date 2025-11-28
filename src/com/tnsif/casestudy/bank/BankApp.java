package com.tnsif.casestudy.bank;

public class BankApp {
	 public static void main(String[] args) {
	        BankFactory factory = new MMBankFactory();
	        
	        SavingAcc sAcc = factory.getNewSavingAcc(101, "Kiran", 5000, false);


	        CurrentAcc cAcc = factory.getNewCurrentAcc(102, "Rohan", 20000, 10000);

	        sAcc.withdraw(3000);
	        cAcc.withdraw(25000);
	        sAcc.withdraw(1000);
	        sAcc.withdraw(500);
	        sAcc.deposite(1000);
	        cAcc.deposite(20000);
	        sAcc.deposite(3000);
	        System.out.println(sAcc.toString());
	        System.out.println(cAcc.toString());
}
}
