package com.tnsif.casestudy.bank;

public abstract class SavingAcc extends BankAcc{
	private  boolean  isSalaried;
	private static final float MINBAL  = 10000f;;
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	@Override
	public abstract void withdraw(float amount);
	@Override
	public String toString() {
		return super.toString();
	}

    public float getMinBal() {
        return MINBAL;
    }

}
