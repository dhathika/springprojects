package com.renuka.service;

import java.util.List;

import com.renuka.pojo.Bank;



public interface BankService {
	
	public void saveBankService(Bank bank);
	public Bank selectBankByIdService(int bankId);
	public void deleteBankByIdService(int bankId);
	public List<Bank> selectAllbanksService();
	public void updateBankService(Bank bank);

}
