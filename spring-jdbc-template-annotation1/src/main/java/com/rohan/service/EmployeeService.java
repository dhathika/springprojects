package com.rohan.service;

import java.util.List;

import com.rohan.model.Employee;

public interface EmployeeService {
	
	public void saveEmployeeService(Employee employee);
	public Employee selectEmployeeByIdService(int empId);
	public void deleteEmployeeByIdService(int empId);
	public List<Employee> selectAllEmployeesService();
	public void updateEmployeeService(Employee employee);

}
