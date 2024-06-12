package com.rohan.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rohan.model.Aadhar;
@Repository
public class AadharRepoImpl implements AadharRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void saveAadharRepo(Aadhar aadhar) {
		String insertQuery = "insert into aadhar1 values (" + aadhar.getAadharId() + "," + "'" + aadhar.getAadharHolderName() + "'"
				+ "," + aadhar.getAge() + "," + aadhar.getIncome() + "," + aadhar.getMobileNo() + ")";
		jdbcTemplate.update(insertQuery);
	}

	public Aadhar selectAadharByIdRepo(int aadharId) {
		String selectQuery = "select * from aadhar1 where aadharid =" +aadharId;
		List aadharList = jdbcTemplate.query(selectQuery, new AadharMapper());
		return (Aadhar) aadharList.get(0);
	}

	public void deleteAadharByIdRepo(int aadharId) {
		String deletequery="delete from aadhar1 where aadharid =" +aadharId;
		jdbcTemplate.execute(deletequery);
	}

	public List<Aadhar> selectAllAadharsRepo() {
		String selectQuery = "select * from aadhar1";
		List aadharList = jdbcTemplate.query(selectQuery, new AadharMapper());
		return  aadharList;
		
		
		
	}

	public void updateEmployeeRepo(Aadhar aadhar) {
		String updatequery = "update aadhar1 set aadharholdername =" + "'" +aadhar.getAadharHolderName() +"'," + "age =" + 
								aadhar.getAge() + "income =" + aadhar.getIncome() +
								"mobileno =" + aadhar.getMobileNo() + "whwere aadharid =" +aadhar.getAadharId();
		
	}
	

}
