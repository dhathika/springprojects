package com.renuka.repository;

import java.util.List;

import com.renuka.pojo.Bank;

public interface BankRepo {
	
	public void saveBankRepo(Bank bank);
	public Bank selectBankByIdRepo(int bankId);
	public void deleteBankByIdRepo(int bankId);
	public List<Bank> selectAllbanksRepo();
	public void updateBankRepo(Bank bank);


}
