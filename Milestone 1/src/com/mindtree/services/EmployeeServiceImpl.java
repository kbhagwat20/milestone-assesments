package com.mindtree.services;

import java.util.ArrayList;
import java.util.Collections;

import com.mindtree.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
    public void displayAllEmployees(ArrayList<Employee> employeeList) {
    	for(int i=0; i< employeeList.size(); i++) 
    	{
    		System.out.println(employeeList.get(i));
    	}
	
    }
	
	public void displayEmployeeNameDescending(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList);
		displayAllEmployees(employeeList);
		
	}
	
	public Employee updateEmployee(ArrayList<Employee> employeeList, int id, int salary) {
		 
		 for(int i=0; i<employeeList.size(); i++) {
			 if(employeeList.get(i).getId()== id)
			 {
				 employeeList.get(i).setSalary(salary);
				 
				 return employeeList.get(i);
			 }
		 }
		 return null;
		
	}
	
	

}
