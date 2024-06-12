package com.renuka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.renuka.pojo.Bank;
import com.renuka.repository.BankRepo;
@Service
public class BankServiceImpl implements BankService{
	@Autowired
	
	private BankRepo bankRepo;
	public BankRepo getBankRepo() {
		return bankRepo;
	}
	public void setBankRepo(BankRepo bankRepo) {
		this.bankRepo = bankRepo;
	}

	@Override
	public void saveBankService(Bank bank) {
		bankRepo.saveBankRepo(bank);
		
	}

	@Override
	public Bank selectBankByIdService(int bankId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBankByIdService(int bankId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bank> selectAllbanksService() {
		List<Bank> bankList = bankRepo.selectAllbanksRepo();
		return bankList;
	}

	@Override
	public void updateBankService(Bank bank) {
		// TODO Auto-generated method stub
		
	}

}
