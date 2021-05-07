package com.bridgelabz.interfacedemo;

import com.bridgelabz.interfacedemo.core.ATMMachine;

public class ATMDemo {

	public static void main(String args[]) {
		ATMMachine atmMachine = new ATMMachine(12345, 20000.0, 1234);
		
		//atmMachine.showBalance(1234, 12345);
		atmMachine.withdraw(1234, 12345, 30000);
	}
}
