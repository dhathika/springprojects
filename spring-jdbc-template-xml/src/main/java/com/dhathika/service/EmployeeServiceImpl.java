package com.dhathika.service;

import java.util.List;

import com.dhathika.model.Employee;
import com.dhathika.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void saveEmployeeService(Employee employee) {
		// service is for business logic
		// Here I am going perform 2 business logics
		// 1.Based on salary cut the tax
		// 2.Based on gender and maritable status set some Title.

		deductEmployeeTax(employee);
		setTitlesToEmplyee(employee);
		employeeRepository.saveEmployeeRepo(employee);
	}

	private void setTitlesToEmplyee(Employee employee) {
		if (employee.getGender().equalsIgnoreCase("male")) {
			employee.setEmpName("Mr." + employee.getEmpName());
		} else if (employee.getGender().equalsIgnoreCase("female") && employee.isMarried()) {
			employee.setEmpName("Smt " + employee.getEmpName());
		} else {
			employee.setEmpName("Miss " + employee.getEmpName());
		}
	}

	public void deductEmployeeTax(Employee employee) {
		if (employee.getEmpSalary() < 500000) {
			System.out.println("Employee is under tax excemption");
		}
		if (employee.getEmpSalary() >= 500000 && employee.getEmpSalary() <= 1000000) {
			double tax = (employee.getEmpSalary() * 0.15);
			double employeeSalaryAfterDeduction = employee.getEmpSalary() - tax;
			employee.setEmpSalary(employeeSalaryAfterDeduction);
		}
		if (employee.getEmpSalary() > 1000000 && employee.getEmpSalary() <= 2000000) {
			double tax = (employee.getEmpSalary() * 0.2);
			double employeeSalaryAfterDeduction = employee.getEmpSalary() - tax;
			employee.setEmpSalary(employeeSalaryAfterDeduction);
		}
		if (employee.getEmpSalary() > 2000000) {
			double tax = (employee.getEmpSalary() * 0.35);
			double employeeSalaryAfterDeduction = employee.getEmpSalary() - tax;
			employee.setEmpSalary(employeeSalaryAfterDeduction);
		}
	}

	public Employee selectEmployeeByIdService(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployeeByIdService(int empId) {
		employeeRepository.deleteEmployeeByIdRepo(empId);
	}

	public List<Employee> selectAllEmployeesService() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployeeService(Employee employee) {
		// TODO Auto-generated method stub

	}

}
