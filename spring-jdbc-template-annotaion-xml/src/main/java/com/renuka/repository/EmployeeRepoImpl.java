package com.renuka.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.renuka.repository.EmployeeMapper;
import com.renuka.repository.EmployeeRepository;
import com.renuka.model.Employee;
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
String insertQuery = "insert into employee21 values (" + employee.getEmpId() + ",'" + employee.getEmpName()
 + "','" + employee.getGender() + "'," + "'" + employee.isMarried() + "'," + employee.getEmpSalary() + "," + employee.getEmpContact() + ")";
		 jdbcTemplate.update(insertQuery);
		
	}

	public Employee selectEmployeeByIdRepo(int empId) {
		String selectByIdQuery = "select * from Employee21 where empid=" + empId;
		List employeeList = jdbcTemplate.query(selectByIdQuery, new EmployeeMapper());
	
		return  (Employee) employeeList.get(0);
	}

	public void deleteEmployeeByIdRepo(int empId) {
		String deleteQuery = "delete from employee21 where empid=" + empId;
		jdbcTemplate.execute(deleteQuery);
		
	}

	public List<Employee> selectAllEmployeesRepo() {
	    String selectAllQuery = "select * from Employee21";
	   List<Employee> empList = jdbcTemplate.query(selectAllQuery, new EmployeeMapper());
		return empList;
	}

	public void updateEmployeeRepo(Employee employee) {
		String updateQuery = "update employee21 set empName = '" + employee.getEmpName() + "',"  +
	                                              "gender ='" + employee.getGender() + "'," +
				                                  "isMarried = '" + employee.isMarried() +"'," +
	                                              "empsalary =" + employee.getEmpSalary() + "," +
				                                  "empcontact =" + employee.getEmpContact() + " where empid = " + employee.getEmpId();
		jdbcTemplate.update(updateQuery);
		
	}

}
