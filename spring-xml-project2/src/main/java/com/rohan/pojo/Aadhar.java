package com.rohan.pojo;

public class Aadhar {
	
	private int aadharId;
	private String aadharHolderName;
	private int age;
	private double income;
	private long mobileNo;
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public String getAadharHolderName() {
		return aadharHolderName;
	}
	public void setAadharHolderName(String aadharHolderName) {
		this.aadharHolderName = aadharHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharHolderName=" + aadharHolderName + ", age=" + age + ", income="
				+ income + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
