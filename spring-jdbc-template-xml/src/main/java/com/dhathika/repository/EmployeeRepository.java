package com.dhathika.repository;

import java.util.List;

import com.dhathika.model.Employee;

public interface EmployeeRepository {
	
	public void saveEmployeeRepo(Employee employee);
	public Employee selectEmployeeByIdRepo(int empId);
	public void deleteEmployeeByIdRepo(int empId);
	public List<Employee> selectAllEmployeesRepo();
	public void updateEmployeeRepo(Employee employee);

}
