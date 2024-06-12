package com.renuka.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.renuka.pojo.Bank;

//private int bankId;
//private String bankName
//private String branchName;
//private String ifscCode;
//private String Address;
//private long accoNumber;
//private String accoHolderName;
//private String accoType;
//private double accobalance;

public class BankMapper implements RowMapper<Bank> {

	@Override
	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bank dummyBank=new Bank();
		
		dummyBank.setBankId(rs.getInt(1));
		dummyBank.setBankName(rs.getString(2));
		dummyBank.setBranchName(rs.getString(3));
		dummyBank.setIfscCode(rs.getString(4));
		dummyBank.setAddress(rs.getString(5));
		dummyBank.setAccoNumber(rs.getLong(6));
		dummyBank.setAccoHolderName(rs.getString(7));
		dummyBank.setAccoType(rs.getString(8));
		dummyBank.setAccobalance(rs.getDouble(9));
		return dummyBank;
	}

}
