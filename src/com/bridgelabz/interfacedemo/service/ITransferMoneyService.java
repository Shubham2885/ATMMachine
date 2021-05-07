package com.bridgelabz.interfacedemo.service;

public interface ITransferMoneyService {

	void transferMoneyFromAtoB(final int accountTo, final int accountFrom, final double balance);
}
