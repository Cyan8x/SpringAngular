package com.mitocode.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.mitocode.collections.list.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		System.out.println("How many emplyees will be registered?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println("Id:");
			Integer id = sc.nextInt();
			
			while(hasId(employees,id)) {
				System.out.println("Id already exists. Try again.");
				id = sc.nextInt();
			}
			
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary:");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id,name,salary);
			
			employees.add(employee);
		}
		
		System.out.println();
		System.out.println("Enter the id of the employee that the salary increase:");
		Integer idSalary = sc.nextInt();
		
//		Optional<Employee> employeeSalary  = employees.stream().filter(emp->emp.getId()==idSalary).findFirst();
//		
//		if (employeeSalary.isPresent()) {
//			System.out.println("The id does not exist.");
//		}else {
//			System.out.println("Enter the percentage:");
//			double percentage = sc.nextDouble();
//			employeeSalary.get().increaseSalary(percentage);
//		}
		
		Employee employeeSalary = employees.stream().filter(emp->emp.getId()==idSalary).findFirst().orElse(null);
		
		if (employeeSalary == null) {
			System.out.println("The id does not exist.");
		}else {
			System.out.println("Enter the percentage:");
			double percentage = sc.nextDouble();
			employeeSalary.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
	}
	
	public static boolean hasId(List<Employee> employees, int id) {
		Employee employee = employees
									.stream()
									.filter(emp->emp.getId()==id)
									.findFirst()
									.orElse(null);
		
		return employee != null;
	}
}
