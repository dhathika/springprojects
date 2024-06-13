package com.renuka.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.renuka.config.ApplicationConfig;
import com.renuka.pojo.Bank;
import com.renuka.service.BankService;
public class BankController {

	public static void main(String[] args) {
		System.out.println("Enter the choice of operation");
		System.out.println("1.Insert Bank");
		System.out.println("2.Select Bank by id");
		System.out.println("3.Delete Bank by id");
		System.out.println("4.Select the all Banks");
		System.out.println("5.Update an Bank");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
		BankService bankService = (BankService)context.getBean(BankService.class);
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Above any one Number......");
		int choiceOfOperation = sc.nextInt();
		switch (choiceOfOperation) {
		case 1: System.out.println("Enter Bank details to save it in db.......");
		
		        Bank bank = new Bank();
		        
		        System.out.println("Enter Bank id");
		        int bankId = sc.nextInt();
		        bank.setBankId(bankId);
		        
		        System.out.println("Enter BankName");
		        String bankName=sc.next();
                bank.setBankName(bankName);
                
                System.out.println("Enter BranchName");
		        String branchName=sc.next();
                bank.setBranchName(branchName);
                
                System.out.println("Enter IfscCode");
		        String ifscCode=sc.next();
                bank.setIfscCode(ifscCode);
                
                System.out.println("Enter Address");
		        String address=sc.next();
                bank.setAddress(address);
                
                System.out.println("Enter Bank accoNumber");
		        long accoNumber = sc.nextLong();
		        bank.setAccoNumber(accoNumber);
                
		        System.out.println("Enter AccoHolderName");
		        String accoHolderName=sc.next();
                bank.setAccoHolderName(accoHolderName);
                
                System.out.println("Enter AccoType");
		        String accoType=sc.next();
                bank.setAccoType(accoType);
                
                System.out.println("Enter  Accobalance");
		        double accobalance = sc.nextDouble();
		        bank.setAccobalance(accobalance);
		        
		        bankService.saveBankService(bank);
		        
                System.out.println("successfully Adding Bank values in database........");
                break;
                
		case 2: System.out.println("Enter the Bank number to select");
        int bankId1 = sc.nextInt();
       Bank selectedBank =  bankService.selectBankByIdService(bankId1);
       System.out.println(selectedBank);
       break;        
		case 3 : System.out.println("Enter Bank id to delete from db");
        int bankIdToDelete = sc.nextInt();
        bankService.deleteBankByIdService(bankIdToDelete);
        break;       
                
		case 4:  System.out.println("Select all bank from bank Table ");
        List<Bank> bankList =  bankService.selectAllbanksService();
        for(int i =0; i<bankList.size(); i++) {
        	System.out.println(bankList.get(i));
        }
        break;   
		case 5:		
			System.out.println("update an bank by using an Id");
			System.out.println("Please Enter the bankId  to Update");
			int bankId11 = sc.nextInt();
			Bank updatebank = bankService.selectBankByIdService(bankId11);
			System.out.println(updatebank);
			
			System.out.println("Enter new bankname update");
			String bankName1 = sc.next();
			updatebank.setBankName(bankName1);
			
			System.out.println("Enter new branchName1  update");
			String branchName1 = sc.next();
			updatebank.setBranchName(branchName1);
			
			System.out.println("Enter new ifscCode1 update");
			String ifscCode1 = sc.next();
			updatebank.setIfscCode(ifscCode1);
			
			System.out.println("Enter new Address  update");
			String address1 = sc.next();
			updatebank.setAddress(address1);
			
			System.out.println("Enter new accoNumber update");
			long accoNumber1 = sc.nextLong();
			updatebank.setAccoNumber(accoNumber1);
			
			
			System.out.println("Enter new accoHolderName  update");
			String accoHolderName1 = sc.next();
			updatebank.setAccoHolderName(accoHolderName1);
			
			System.out.println("Enter new accoType  update");
			String accoType1 = sc.next();
			updatebank.setAccoType(accoType1);
			

			System.out.println("Enter new accobalance update");
			double accobalance1 = sc.nextDouble();
			updatebank.setAccobalance(accobalance1);
			
			bankService.updateBankService(updatebank);
		
		break;
	

                
		default:
			break;
			
			//private int bankId;
//			private String bankName;
//			private String branchName;
//			private String ifscCode;
//			private String Address;
//			private long accoNumber;
//			private String accoHolderName;
//			private String accoType;
//			private double accobalance;
                
                

	}
	}

}
