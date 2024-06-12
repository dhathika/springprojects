package com.renuka.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.renuka.pojo.Bank;

@Repository

public class BankRepoImpl implements BankRepo {
	
	@Autowired
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//	private int bankId;
//	private String bankName;
//	private String branchName;
//	private String ifscCode;
//	private String Address;
//	private long accoNumber;
//	private String accoHolderName;
//	private String accoType;
//	private double accobalance;
//	
	
	
	@Override
	public void saveBankRepo(Bank bank) {
		String insertQuery = "insert into bank values (" + bank.getBankId()+
				",'" + bank.getBankName()+
				"','"+bank.getBranchName()+
				"','"+bank.getIfscCode()+
				"','"+bank.getAddress()+
				"',"+bank.getAccoNumber()+
				",'"+bank.getAccoHolderName()+
				"','"+bank.getAccoType()+"'"+
				","+ bank.getAccobalance()+ ")";
		 jdbcTemplate.update(insertQuery);
		
	}

	@Override
	public Bank selectBankByIdRepo(int bankId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBankByIdRepo(int bankId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bank> selectAllbanksRepo() {
		String selectAllQuery = "select * from bank";
		   List<Bank> bankList = jdbcTemplate.query(selectAllQuery, new BankMapper());
			return bankList;
	}

	@Override
	public void updateBankRepo(Bank bank) {
		// TODO Auto-generated method stub
		
	}

}
