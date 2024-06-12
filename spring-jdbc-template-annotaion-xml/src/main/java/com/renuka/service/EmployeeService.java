package com.renuka.service;

import java.util.List;

import com.renuka.model.Employee;

public interface EmployeeService {
	
// Interface will have only abstract methods if they are private how the implemented
// classes can access them to give body/implementation of that method. 

	public void saveEmployeeService(Employee employee);
	public Employee selectEmployeeByIdService(int empId);
	public void deleteEmployeeByIdService(int empId);
	public List<Employee> selectAllEmployeesService();
	public void updateEmployeeService(Employee employee);
}
