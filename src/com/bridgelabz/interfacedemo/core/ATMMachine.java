package com.bridgelabz.interfacedemo.core;

import com.bridgelabz.interfacedemo.service.ICommanService;
import com.bridgelabz.interfacedemo.service.IWithdrawServer;

public class ATMMachine implements ICommanService, IWithdrawServer{

	private int accountNo;
	private double balance;
	private int pin;
	
	public ATMMachine() {
		
	}
	
	public ATMMachine(int accountNumber, double balanceOK, int pinOK) {
		System.out.println("Constructor");
		accountNo = accountNumber;
		balance = balanceOK;
		pin = pinOK;
	}
	
//	public int getAccountNo() {
//		return accountNo;
//	}
//	public void setAccountNo(int accountNo) {
//		this.accountNo = accountNo;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	public int getPin() {
//		return pin;
//	}
//	public void setPin(int pin) {
//		this.pin = pin;
//	}
	@Override
	public void showBalance(final int pin, final int accountNo) {
		if(validatePin(pin,accountNo)) {
			if(isBalanceAvailable()) {
				System.out.println("Balance is :: "+balance);
			}else {
				System.out.println("Balance is not available");
			}
			
		}
	}

	private boolean validatePin(final int pin, final int accountNo) {
		if(pin == this.pin && accountNo == this.accountNo) {
			System.out.println("Pin is correct");
			return true;
		}else {
			System.out.println("Pin is incorrect");
			return false;
		}
	}
	
	private boolean isBalanceAvailable() {
//		if(validatePin(pin,accountNo)) {
//			if(balance>0)
//				return true;
//			return false;
//		}
//		return false;
		return (balance> 0);
	}

	@Override
	public void withdraw(int atmPin, int accountNo, double money) {
		if(validatePin(atmPin, accountNo)) {
			if(isBalanceAvailable()) {
				if(balance > money) {
					System.out.println("Take your money ::"+money);
					this.balance = balance - money;
					System.out.println("Now your balance is :: "+this.balance);
				}else {
					System.out.println("Balance is less than you want ::"+this.balance);
				}
			}
		}
	}
}
