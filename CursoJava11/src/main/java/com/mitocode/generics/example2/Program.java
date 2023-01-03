package com.mitocode.generics.example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args){
		List<Product> products = new ArrayList();
		
		String path = "D:\\SPRING TOOL\\CursoJava11\\src\\main\\resources\\in.txt";
		
		try(BufferedReader br  = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line!=null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line=br.readLine();
			}
			Product product = CalculationService.max(products);
			System.out.println("Most Expensive");
			System.out.println(product);
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}
}
