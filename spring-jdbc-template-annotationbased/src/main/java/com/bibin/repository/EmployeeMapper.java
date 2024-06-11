package com.bibin.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.bibin.model.Employee;

@Component
public class EmployeeMapper {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Employee dummyEmployee = new Employee();
		 dummyEmployee.setEmpId(rs.getInt(1));
		 dummyEmployee.setEmpName(rs.getString(2));
		 dummyEmployee.setGender(rs.getString(3));
		 dummyEmployee.setMarried(rs.getBoolean(4));
		 dummyEmployee.setEmpSalary(rs.getDouble(5));
		 dummyEmployee.setEmpContact(rs.getLong(6));
		 
			return dummyEmployee;
		}

}
