package com.bridgelabz.interfacedemo.service;

public interface ICommanService {

	void showBalance(final int pin, final int accountNo);
	default void show() {
		
	};
}
