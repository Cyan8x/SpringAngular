package com.mitocode.interfaces.services;

public interface OnlinePaymentService {
	public double paymentsFee(double amount);

	public double interest(double amount, int months);
}
