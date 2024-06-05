package com.rohan.controller;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rohan.pojo.Aadhar;
import com.rohan.service.AadharService;

public class AadharController {
	
	public static void main(String[] args) {
		
	
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanfactory=new XmlBeanFactory(resource);
	Aadhar aadhar = (Aadhar) beanfactory.getBean("aadhar");
	AadharService aadharservice = (AadharService) beanfactory.getBean("aadharservice");
//	aadharservice.saveAadharService(aadhar);
	
//	Aadhar aadharId =aadharservice.selectByAadharIdService(1214);
//	System.out.println(aadharId);
	
//	List<Aadhar> list = aadharservice.selectAllAadharsServic();
//	for(Aadhar adar:list) {
//		System.out.println(adar);
//	}
	
//	List<Aadhar> list1 =aadharservice.selectAllAdharIncomeLowtoHigh();
//	for(Aadhar aad:list1) {
//		System.out.println(aad);
//	}
	
//	List<Aadhar> list2 =aadharservice.selectAllAdharIncomeHighToLow();
//	for(Aadhar aad:list2) {
//		System.out.println(aad);
//	}
	
//	aadharservice.deleteAadhar(1234);
	
	Aadhar updatedaadhar = aadharservice.selectByAadharIdService(1214);
	updatedaadhar.setAadharHolderName("vishnu");
	updatedaadhar.setAge(21);
	Aadhar aadhar1 = aadharservice.updateAadhar(updatedaadhar);
	System.out.println(aadhar1);
	}
}
