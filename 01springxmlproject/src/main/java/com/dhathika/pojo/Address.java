package com.dhathika.pojo;

public class Address {

	private int dno;
	private String street;
	private String city;
	private String state;
	private long pin;
	
	
	public Address() {
		
	}

	public Address(int dno, String street, String city, String state, long pin) {
	
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	

	

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", state=" + state + ", pin=" + pin
				+ "]";
	}

}
