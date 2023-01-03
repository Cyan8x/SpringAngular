package com.mitocode.interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mitocode.interfaces.entities.Contract;
import com.mitocode.interfaces.services.ContractService;
import com.mitocode.interfaces.services.PaypalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Date (dd/MM/yyyy)");
		Date date = formatDate.parse(scan.next());
		
		Contract contract = new Contract(123, date, 233.00);
		ContractService contractService = new ContractService(new PaypalService());
	}
}
