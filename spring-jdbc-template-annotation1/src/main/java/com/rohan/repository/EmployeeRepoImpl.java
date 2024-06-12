package com.rohan.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rohan.repository.EmployeeMapper;
import com.rohan.model.Employee;
@Repository
public class EmployeeRepoImpl implements EmployeeRepository{
@Autowired
private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveEmployeeRepo(Employee employee) {
String insertQuery = "insert into employee values (" + employee.getEmpId() + ",'" + employee.getEmpName()
 + "','" + employee.getGender() + "'," + "'" + employee.isMarried() + "'," + employee.getEmpSalary() + "," + employee.getEmpContact() + ")";
		 jdbcTemplate.update(insertQuery);
		
	}

	public Employee selectEmployeeByIdRepo(int empId) {
		String selectByIdQuery = "select * from Employee where empid=" + empId;
		List employeeList = jdbcTemplate.query(selectByIdQuery, new EmployeeMapper());
	
		return  (Employee) employeeList.get(0);
	}

	public void deleteEmployeeByIdRepo(int empId) {
		String deleteQuery = "delete from employee where empid=" + empId;
		jdbcTemplate.execute(deleteQuery);
		
	}

	public List<Employee> selectAllEmployeesRepo() {
	    String selectAllQuery = "select * from Employee";
	   List<Employee> empList = jdbcTemplate.query(selectAllQuery, new EmployeeMapper());
		return empList;
	}

	public void updateEmployeeRepo(Employee employee) {
		String updateQuery = "update employee set empName = '" + employee.getEmpName() + "',"  +
	                                              "gender ='" + employee.getGender() + "'," +
				                                  "isMarried = '" + employee.isMarried() +"'," +
	                                              "empsalary =" + employee.getEmpSalary() + "," +
				                                  "empcontact =" + employee.getEmpContact() + " where empid = " + employee.getEmpId();
		jdbcTemplate.update(updateQuery);
		
	}

}
