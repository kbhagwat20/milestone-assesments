package com.mindtree.services;
import java.util.ArrayList;
import com.mindtree.entity.Employee;

public interface EmployeeService {
	
    public void displayAllEmployees(ArrayList<Employee> employeeList);
	
	public void displayEmployeeNameDescending(ArrayList<Employee> employeeList);
	
	public Employee updateEmployee(ArrayList<Employee> employeeList, int id, int salary);
	

}
