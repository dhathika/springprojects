package com.dhathika.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dhathika.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepository{
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveEmployeeRepo(Employee employee) {
String insertQuery = "insert into employee1 values (" + employee.getEmpId() + ",'" + employee.getEmpName()
 + "','" + employee.getGender() + "'," + "'" + employee.isMarried() + "'," + employee.getEmpSalary() + "," + employee.getEmpContact() + ")";
		 jdbcTemplate.update(insertQuery);
		
	}

	public Employee selectEmployeeByIdRepo(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployeeByIdRepo(int empId) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> selectAllEmployeesRepo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployeeRepo(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}