package com.tnsif.casestudy.bank;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal,creditLimit);
	}

	@Override
	public void withdraw(float amount) {
		if (amount > accBal + getCreditLimit()) {
            System.out.println("Withdrawal denied! Exceeds credit limit.");
        } else {
            accBal -= amount;
            System.out.println("Withdrawn: " + amount);
        }
	}
	@Override
    public String toString() {
        return super.toString();
    }

}
