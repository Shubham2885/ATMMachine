package com.bridgelabz.interfacedemo.service;

public interface IWithdrawServer {

	void withdraw(final int atmPin, final int accountNo, final double money);
}
