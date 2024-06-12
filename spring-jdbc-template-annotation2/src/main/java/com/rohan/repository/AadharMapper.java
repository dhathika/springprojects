package com.rohan.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rohan.model.Aadhar;

public class AadharMapper implements RowMapper<Aadhar>{

	public Aadhar mapRow(ResultSet rs, int rowNum) throws SQLException {
		Aadhar dummyaadhar = new Aadhar();
		dummyaadhar.setAadharId(rs.getInt(1));
		dummyaadhar.setAadharHolderName(rs.getString(2));
		dummyaadhar.setAge(rs.getInt(3));
		dummyaadhar.setIncome(rs.getDouble(4));
		dummyaadhar.setMobileNo(rs.getLong(5));
		return dummyaadhar;
	}

}
