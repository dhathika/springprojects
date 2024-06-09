package com.dhathika.model;

public class Employee {
	
	
	private int empId;
	private String empName;
	private String gender;
	private boolean isMarried;
	private double empSalary;
	private long empContact;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public long getEmpContact() {
		return empContact;
	}
	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", isMarried=" + isMarried
				+ ", empSalary=" + empSalary + ", empContact=" + empContact + "]";
	}
	
	
}
