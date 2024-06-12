package com.rohan.service;

import java.util.List;

import com.rohan.model.Aadhar;

public interface AadharService {
	
	public void saveAadharService(Aadhar aadhar);
	public Aadhar selectAadharByIdService(int aadharId);
	public void deleteAadharByIdService(int aadharId);
	public List<Aadhar> selectAllAadharsService();
	public void updateEmployeeService(Aadhar aadhar);

}
