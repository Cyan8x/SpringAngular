package com.mitocode.generics.example1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService();
		
		System.out.println("How many items do you want to print?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		System.out.println("First item: " + ps.first());
		
		ps.print();
		
		sc.close();
		
	}
}
