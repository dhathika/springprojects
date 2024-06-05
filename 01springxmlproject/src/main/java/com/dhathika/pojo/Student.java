package com.dhathika.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;
	private String name;
	private Address address;
	private List<Long> mobileContacts;
	private Set<String> subjects;
	private Map<String, Integer> marks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Long> getMobileContacts() {
		return mobileContacts;
	}
	public void setMobileContacts(List<Long> mobileContacts) {
		this.mobileContacts = mobileContacts;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", mobileContacts=" + mobileContacts
				+ ", subjects=" + subjects + ", marks=" + marks + "]";
	} 
	
	

}
