package com.rohan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.model.Aadhar;
import com.rohan.repository.AadharRepository;
@Service
public class AadharServiceImpl implements AadharService{
	@Autowired
	private AadharRepository aadharrepository;
	public void saveAadharService(Aadhar aadhar) {
		
		aadharrepository.saveAadharRepo(aadhar);
		
	}

	public Aadhar selectAadharByIdService(int aadharId) {
		Aadhar aadhar = aadharrepository.selectAadharByIdRepo(aadharId);
		return aadhar;
	}

	public void deleteAadharByIdService(int aadharId) {
		aadharrepository.deleteAadharByIdRepo(aadharId);
		
	}

	public List<Aadhar> selectAllAadharsService() {
		List<Aadhar> list = aadharrepository.selectAllAadharsRepo();
		return list;
	}

	public void updateEmployeeService(Aadhar aadhar) {
		aadharrepository.updateEmployeeRepo(aadhar);
		
	}
	
	

}
