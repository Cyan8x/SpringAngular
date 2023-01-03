package com.mitocode.funcional;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {
	public void metodo1() {
		Consumer<String> imprimir = x -> System.out.println(x);
		imprimir.accept("Leonardo");
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
		lista.forEach(e -> System.out.println(lista));
		
	}
	
	public void metodo2() {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<Integer> consumer = x -> {
			x++;
			System.out.println(x);
		};
		
		imprimir(lista, consumer);
	}
	
	private<T> void imprimir (List<T> lista, Consumer<T> function) {
		for (T i: lista) {
			function.accept(i);
		}
	} 
	
	public static void main(String[] args) {
		ConsumerApp consumerApp = new ConsumerApp();
		consumerApp.metodo1();
		consumerApp.metodo2();
	}
}
