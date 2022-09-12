package com.mindtree.client;
import java.util.Scanner;

import java.util.ArrayList;

import com.mindtree.entity.Employee;
import com.mindtree.services.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) 
		{
			Scanner sc =new Scanner(System.in);
			Employee e = new Employee();
			e.setId(i+1);
			System.out.println("Enter name of the employee");
			e.setName(sc.nextLine());
			System.out.println("Enter age of the employee");
			e.setAge(sc.nextInt());
			System.out.println("Enter Salary of the employee");
			e.setSalary(sc.nextInt());
			list.add(e);
		}
		
		System.out.println("Enter choice: ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		do {
		switch(n) {
		
		case 1:
			service.displayAllEmployees(list);
			break;
			
		case 2:
			service.displayEmployeeNameDescending(list);
			break;
			
		case 3:
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("Enter Salary: ");
		int Salary = sc.nextInt();
		Employee result = service.updateEmployee(list, id, Salary);
		System.out.println("Updated Information: ");
		System.out.println(result);
		    break;
		    
		case 4:
			System.exit(0);
		
		
		}
		System.out.println("Enter choice: ");
	    n = sc.nextInt();
		}while(true);

	}

}
