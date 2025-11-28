package com.tnsif.casestudy.bank;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL = 1000f;
	public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo,accNm,accBal,isSalaried);
	}
	@Override
	public void withdraw(float amount) {
		float effectiveMinBal = isSalaried() ? 0 : MINBAL;  // salaried = zero balance allowed

        if (accBal - amount < effectiveMinBal) {
            System.out.println("Withdrawal denied!(from mmsaving acc) Cannot go below minimum balance :"+effectiveMinBal);
        } else {
            accBal -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + accBal);
        }
    }
	@Override
	public String toString() {
		return super.toString();
	}
	
}
