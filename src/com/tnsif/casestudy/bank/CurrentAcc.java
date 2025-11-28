package com.tnsif.casestudy.bank;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	public CurrentAcc(int accNo,String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		if(creditLimit <= 0) {
			this.creditLimit = 50000f;
		}else {
			this.creditLimit = creditLimit;
		}
	}
	 public float getCreditLimit() {
	        return creditLimit;
	    }
	@Override
	public abstract void withdraw(float amount);
	@Override
	public String toString() {
		return super.toString();
	}
}
