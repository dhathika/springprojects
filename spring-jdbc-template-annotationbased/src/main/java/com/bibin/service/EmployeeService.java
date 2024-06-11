package com.bibin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bibin.model.Employee;


@Service
public interface EmployeeService {
	public void saveEmployeeService(Employee employee);
	public Employee selectEmployeeByIdService(int empId);
	public void deleteEmployeeByIdService(int empId);
	public List<Employee> selectAllEmployeesService();
	public void updateEmployeeService(Employee employee);

}
