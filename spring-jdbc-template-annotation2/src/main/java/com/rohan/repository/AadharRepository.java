package com.rohan.repository;

import java.util.List;

import com.rohan.model.Aadhar;

public interface AadharRepository {
	
	public void saveAadharRepo(Aadhar aadhar);
	public Aadhar selectAadharByIdRepo(int aadharId);
	public void deleteAadharByIdRepo(int aadharId);
	public List<Aadhar> selectAllAadharsRepo();
	public void updateEmployeeRepo(Aadhar aadhar);

}
