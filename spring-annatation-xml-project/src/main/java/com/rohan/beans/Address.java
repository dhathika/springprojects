package com.rohan.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
		
		private int doorNo;
		private String streetName;
		private String city;
		private String state;
		private long pin;
		private Landmark landmark;
		
		
		public int getDoorNo() {
			return doorNo;
		}
		public void setDoorNo(int doorNo) {
			this.doorNo = doorNo;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
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
		public Landmark getLandmark() {
			return landmark;
		}
		public void setLandmark(Landmark landmark) {
			this.landmark = landmark;
		}
		@Override
		public String toString() {
			return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
					+ ", pin=" + pin + ", landmark=" + landmark + "]";
		}
		

}
