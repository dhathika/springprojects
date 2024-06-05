package com.rohan.service;

import java.util.List;

import com.rohan.dao.AadharDao;
import com.rohan.pojo.Aadhar;

public class AadharService {
	
	AadharDao aadhardao;
	
	
	
	public AadharDao getAadhardao() {
		return aadhardao;
	}

	public void setAadhardao(AadharDao aadhardao) {
		this.aadhardao = aadhardao;
	}

	public void saveAadharService(Aadhar aadhar ) {
		aadhardao.saveAadharDao(aadhar);
		
	}
	
	public Aadhar selectByAadharIdService(int aadharId) {
		Aadhar aadhar = aadhardao.selectByAadharIdDao(aadharId);
		return aadhar;
	}
	
	public List<Aadhar> selectAllAadharsServic(){
		List<Aadhar> list = aadhardao.selectAllAadharsDao();
		
		return list;
	}
	
	public List<Aadhar> selectAllAdharIncomeLowtoHigh(){
		List<Aadhar> list1 = aadhardao.selectAllAdharIncomeLowtoHighDao();
		return list1;
	}
	
	public List<Aadhar> selectAllAdharIncomeHighToLow(){
		List<Aadhar> list2 =aadhardao.selectAllAdharIncomeHighToLowDao();
		return list2;
	}
	
	public void deleteAadhar(int aadharid) {
		aadhardao.deleteAadharDao(aadharid);
	}
	
	public Aadhar updateAadhar(Aadhar aadhar) {
		Aadhar updateadhar = aadhardao.updateAadharDao(aadhar);
		return updateadhar;
	}

}
