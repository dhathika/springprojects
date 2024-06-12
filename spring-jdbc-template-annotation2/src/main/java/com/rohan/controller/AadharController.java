package com.rohan.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohan.config.AppConfig;
import com.rohan.model.Aadhar;
import com.rohan.service.AadharService;
import com.rohan.service.AadharServiceImpl;

public class AadharController {

	public static void main(String[] args) {

		System.out.println("Enter the choice of operation");
		System.out.println("1.Insert Aadhar");
		System.out.println("2.Select Aadhar by id");
		System.out.println("3.Delete Aadhar by id");
		System.out.println("4.Get all Aadhars");
		System.out.println("5.Update an Aadhar");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AadharService aadharService = (AadharService) context.getBean(AadharServiceImpl.class);

		Scanner sc = new Scanner(System.in);
		int choiceOfOperation = sc.nextInt();
		switch (choiceOfOperation) {
		case 1:
			System.out.println("Enter Aadhar Details ");
			Aadhar aadhar = new Aadhar();
			System.out.println("Enter Aadhar Id");
			aadhar.setAadharId(sc.nextInt());
			System.out.println("Enter AadharHoldername");
			aadhar.setAadharHolderName(sc.next());
			System.out.println("Enter Age");
			aadhar.setAge(sc.nextInt());
			System.out.println("Enter Income");
			aadhar.setIncome(sc.nextDouble());
			System.out.println("Enter the MobileNo");
			aadhar.setMobileNo(sc.nextLong());
			aadharService.saveAadharService(aadhar);
			System.out.println("end of the save aadhar");
			break;
		case 2:
			System.out.println("Enter the Aadhar select by Id");
			int id = sc.nextInt();
			Aadhar selectedaadhar = aadharService.selectAadharByIdService(id);
			System.out.println(selectedaadhar);
			break;
		case 3:
			System.out.println("delete one aadhar by using aadarid");
			int deleteid = sc.nextInt();
			aadharService.deleteAadharByIdService(deleteid);
			break;
		case 4:
			System.out.println("select all aadhars");
			List<Aadhar> adrlist = aadharService.selectAllAadharsService();
			for (Aadhar ard : adrlist) {
				System.out.println(ard);
			}
			break;
		case 5:
			System.out.println("update an adhar by using aadhar id");
			List<Aadhar> adrlist1 = aadharService.selectAllAadharsService();
			for (Aadhar ard : adrlist1) {
				System.out.println(ard);
			}
			System.out.println("Select One object by aadharId for update ");
			int selectedAadharIdForUpdate = sc.nextInt();
			Aadhar SelectedAadharToUpdate = aadharService.selectAadharByIdService(selectedAadharIdForUpdate);
			System.out.println(SelectedAadharToUpdate);
			System.out.println("Do you want to update the name? enter yes or no");
			String updateName = sc.next();
			Aadhar dummyaadhar = new Aadhar();
			dummyaadhar.setAadharId(SelectedAadharToUpdate.getAadharId());
			if (updateName.equalsIgnoreCase("yes")) {
				System.out.println("enter the udpated name");
				String updatedName = sc.next();
				dummyaadhar.setAadharHolderName(updatedName);
			} else {
				dummyaadhar.setAadharHolderName(SelectedAadharToUpdate.getAadharHolderName());
			}
			System.out.println("Do you want to update the age? enter yes or no");
			String updateage = sc.next();
			if (updateage.equalsIgnoreCase("yes")) {
				System.out.println("Enter the udpated age");
				int updatedage = sc.nextInt();
				dummyaadhar.setAge(updatedage);
			} else {
				dummyaadhar.setAge(SelectedAadharToUpdate.getAge());
			}
			System.out.println("Do you want to update the income? enter yes or no");
			String updateincome = sc.next();
			if (updateincome.equalsIgnoreCase("yes")) {
				System.out.println("Enter the udpated income");
				double updatedincome = sc.nextDouble();
				dummyaadhar.setIncome(updatedincome);
			} else {
				dummyaadhar.setIncome(SelectedAadharToUpdate.getIncome());
			}
			System.out.println("Do you want to update the number? enter yes or no");
			String updatemobileNo = sc.next();
			if (updatemobileNo.equalsIgnoreCase("yes")) {
				System.out.println("Enter the udpated mobile no");
				 long updatednumber = sc.nextLong();
				dummyaadhar.setMobileNo(updatednumber);
			} else {
				dummyaadhar.setMobileNo(SelectedAadharToUpdate.getMobileNo());
			}
			System.out.println("You prepared updateEmployee object for update");
			System.out.println(dummyaadhar);
			aadharService.updateEmployeeService(dummyaadhar);
		default:
			break;
		}
	}

}
