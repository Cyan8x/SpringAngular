package com.mitocode.interfaces.services;

import java.util.Iterator;

import com.mitocode.interfaces.entities.Contract;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService; 
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue()/months;
		for (int i = 0; i < months; i++) {
			double fullQuota = onlinePaymentService.paymentsFee(i);
		}
	}
}
