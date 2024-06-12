package com.renuka.pojo;

public class Bank {
	private int bankId;
	private String bankName;
	private String branchName;
	private String ifscCode;
	private String Address;
	private long accoNumber;
	private String accoHolderName;
	private String accoType;
	private double accobalance;
	
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getAccoNumber() {
		return accoNumber;
	}
	public void setAccoNumber(long accoNumber) {
		this.accoNumber = accoNumber;
	}
	public String getAccoHolderName() {
		return accoHolderName;
	}
	public void setAccoHolderName(String accoHolderName) {
		this.accoHolderName = accoHolderName;
	}
	public String getAccoType() {
		return accoType;
	}
	public void setAccoType(String accoType) {
		this.accoType = accoType;
	}
	public double getAccobalance() {
		return accobalance;
	}
	public void setAccobalance(double accobalance) {
		this.accobalance = accobalance;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", branchName=" + branchName + ", ifscCode="
				+ ifscCode + ", Address=" + Address + ", accoNumber=" + accoNumber + ", accoHolderName="
				+ accoHolderName + ", accoType=" + accoType + ", accobalance=" + accobalance + "]";
	}
	
	
	

}
