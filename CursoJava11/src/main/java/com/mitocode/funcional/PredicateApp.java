package com.mitocode.funcional;

import java.util.function.Predicate;

public class PredicateApp {
	public void metodo1() {
		Persona per = new Persona();
		per.setEdad(20);
		
		Predicate<Persona> mayorque = p -> p.getEdad()>=18;
		
		if (mayorque.test(per)) {
			System.out.println("Es mayor de edad");
		}
		
		metodo2(mayorque);
	}
	
	public void metodo2(Predicate<Persona> function) {
		
	}
	
	public void metodo3() {
		Predicate<Integer> mayorque = x -> x>10;
		Predicate<Integer> menorque = x -> x<20;
		
		boolean resultado = mayorque.and(menorque).test(15);
		System.out.println(resultado);
	}
	
	public void metodo4(int num, Predicate<Integer> function) {
		if (function.test(num)) {
			System.out.println("Cumplió");
		} else {
			System.out.println("NO Cumplió");
		}
	}
	
	
	public static void main(String[] args) {
		PredicateApp predicateApp = new PredicateApp();
		predicateApp.metodo1();
		predicateApp.metodo3();
		predicateApp.metodo4(3, x -> x>7);
	}
}
