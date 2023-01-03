package com.mitocode.funcional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierApp {
	public void metodo1() {
		Supplier<LocalDateTime> sup = () -> LocalDateTime.now();
		System.out.println(sup.get());
	}
	
	public static void main(String[] args) {
		SupplierApp supplierApp = new SupplierApp();
		supplierApp.metodo1();
	}
}
