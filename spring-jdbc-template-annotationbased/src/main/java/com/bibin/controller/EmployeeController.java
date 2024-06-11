package com.bibin.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.bibin.Appconfig.ApplicationConfiguration;
import com.bibin.model.Employee;
import com.bibin.service.EmployeeService;

@Controller
public class EmployeeController {

	public static void main(String[] args) {
		System.out.println("Enter the choice of operation");
		System.out.println("1.Insert Employee");
		System.out.println("2.Select Employee by id");
		System.out.println("3.Delete Employee by id");
		System.out.println("4.Get all Employees");
		System.out.println("5.Update an Employee");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		
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
			    employeeService.saveEmployeeService(employee);
			    System.out.println("end of save employee operation");
			break;
		case 2 : System.out.println("Enter the employee number to select");
		         int empId1 = sc.nextInt();
		        Employee selectedEmployee =  employeeService.selectEmployeeByIdService(empId1);
		        System.out.println(selectedEmployee);
		        break; 
		case 3 : System.out.println("Enter employee id to delete from db");
		         int empIdToDelete = sc.nextInt();
		         employeeService.deleteEmployeeByIdService(empIdToDelete);
		         break;
		case 4 : System.out.println("Select all employee from Employee Table ");
		        List<Employee> empList =  employeeService.selectAllEmployeesService();
                for(int i =0; i<empList.size(); i++) {
                	System.out.println(empList.get(i));
                }
                break;
                
		case 5: System.out.println("Find all Employees to select one Employee to update");
		       List<Employee> empList1 =  employeeService.selectAllEmployeesService();
		       for(Employee emp : empList1)
		    	   System.out.println(emp);
		        System.out.println("Select One object by empId for update ");
		        int selectedEmployeeIdForUpdate = sc.nextInt();
		       Employee selectedEmployeeToUpdate =  employeeService.selectEmployeeByIdService(selectedEmployeeIdForUpdate);
		        System.out.println(selectedEmployeeToUpdate);
		        System.out.println("Do you want to update the name? enter yes or no");
		        String updateName = sc.next();
		        Employee dummyEmployee = new Employee();
		        dummyEmployee.setEmpId(selectedEmployeeToUpdate.getEmpId());
		        if(updateName.equalsIgnoreCase("yes")) {
		        	System.out.println("enter the udpated name");
		        	String updatedName = sc.next();
		        	dummyEmployee.setEmpName(updatedName);
		        }else
		        {
		        	dummyEmployee.setEmpName(selectedEmployeeToUpdate.getEmpName());
		        }
		        System.out.println("Do you want to update the gender ? enter yes or no");
		        String updateGender = sc.next();
		        if(updateGender.equalsIgnoreCase("yes")) {
		        	System.out.println("Enter the udpated gender");
		          String updatedGender = sc.next();
		          dummyEmployee.setGender(updatedGender);
		        }
		        else
		        {
		        	dummyEmployee.setGender(selectedEmployeeToUpdate.getGender());
		        }
		        System.out.println("Do you want to update marital status? enter yes or no");
		        String updateMaritalStatus = sc.next();
		        if(updateMaritalStatus.equalsIgnoreCase("yes")) {
		        	System.out.println("Enter updated marital status with boolean value true or false");
		        	boolean updatedMaritalStatus = sc.nextBoolean();
		        	dummyEmployee.setMarried(updatedMaritalStatus);
		        }
		        else {
		        	dummyEmployee.setMarried(selectedEmployeeToUpdate.isMarried());
		        }
		        System.out.println("Do you want to update the salary? enter yes or no");
		        String updateSalaryStatus = sc.next();
		        if(updateSalaryStatus.equalsIgnoreCase("yes")) {
		        	System.out.println("Enter updated salary");
		        	double updatedSalary = sc.nextDouble();
		        	dummyEmployee.setEmpSalary(updatedSalary);
		        }
		        else {
		        	dummyEmployee.setEmpSalary(selectedEmployeeToUpdate.getEmpSalary());
		        	
		        }
		        System.out.println("Do you want to update the contact? enter Yes or No");
		        String updateContactStatus = sc.next();
		        if(updateContactStatus.equalsIgnoreCase("yes")) {
		        	System.out.println("Enter udpated contact");
		        	long updatedContact = sc.nextLong();
		        	dummyEmployee.setEmpContact(updatedContact);
		        }else {
		        	dummyEmployee.setEmpContact(selectedEmployeeToUpdate.getEmpContact());
		        }
		        System.out.println("You prepared updateEmployee object for update");
		        System.out.println(dummyEmployee);
		        employeeService.updateEmployeeService(dummyEmployee);
		default:
			break;
		}

	}

	}


