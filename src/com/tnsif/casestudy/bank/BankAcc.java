package com.tnsif.casestudy.bank;

public abstract class BankAcc {
	private final int accNo;
	private String accNm;
	protected float accBal;
	public BankAcc(int accNo,String accNm,float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public abstract void withdraw(float amount);
	public  void deposite(float amount) {
		 accBal += amount;
	     System.out.println("Deposited: " + amount);
		
	}
	public String toString() {
		return "Account No :" + accNo + "\nAccount Name :"+accNm + "\nAccount Balance :" + accBal;
		
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
}

