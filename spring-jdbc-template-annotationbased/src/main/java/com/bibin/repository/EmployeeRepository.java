package com.bibin.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bibin.model.Employee;


@Repository
public interface EmployeeRepository {
	
	public void saveEmployeeRepo(Employee employee);
	public Employee selectEmployeeByIdRepo(int empId);
	public void deleteEmployeeByIdRepo(int empId);
	public List<Employee> selectAllEmployeesRepo();
	public void updateEmployeeRepo(Employee employee);

}
