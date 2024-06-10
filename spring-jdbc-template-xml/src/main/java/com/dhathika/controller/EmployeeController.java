package com.dhathika.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.dhathika.model.Employee;
import com.dhathika.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		
		System.out.println("Enter the choice of operation");
		System.out.println("1.Insert Employee");
		System.out.println("2.Select Employee by id");
		System.out.println("3.Delete Employee by id");
		System.out.println("4.Get all Employees");
		System.out.println("5.Update an Employee");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		EmployeeService employeService = (EmployeeService) context.getBean("employeeService");
		
		Scanner sc = new Scanner(System.in);
		int choiceOfOperation = sc.nextInt();
		switch (choiceOfOperation) {
		case 1: System.out.println("Enter employee details to save it in db");
		        Employee employee = new Employee();
		        System.out.println("Enter employee id");
		        int empId = sc.nextInt();
		        employee.setEmpId(empId);
		        System.out.println("Enter employee name");
		        String empName = sc.next();
		        employee.setEmpName(empName);
		        System.out.println("Enter employee gender");
		        String empGender = sc.next();
		        employee.setGender(empGender);
		        System.out.println("Enter employee marital status, If married enter 1, else 0");
		        boolean isMarried = sc.nextBoolean();
		        employee.setMarried(isMarried);
		        System.out.println("Enter employee salary");
		        double empSalary = sc.nextDouble();
		        employee.setEmpSalary(empSalary);
		        System.out.println("Enter Employee contact ");
		        long empContact = sc.nextLong();
		        employee.setEmpContact(empContact);
			    employeService.saveEmployeeService(employee);
			    System.out.println("end of save employee operation");
			break;
		case 2:
			System.out.println("Enter employee id you want to delete : ");
			employeService.deleteEmployeeByIdService(sc.nextInt());
			System.out.println(" deleted");
			break;

		default:
			break;
		}

	}

}
