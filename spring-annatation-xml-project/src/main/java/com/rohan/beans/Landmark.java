package com.rohan.beans;

public class Landmark {
	
	private String landmarkname;
	private long landmarkdistance;
	
	
	public String getLandmarkname() {
		return landmarkname;
	}
	public void setLandmarkname(String landmarkname) {
		this.landmarkname = landmarkname;
	}
	public long getLandmarkdistance() {
		return landmarkdistance;
	}
	public void setLandmarkdistance(long landmarkdistance) {
		this.landmarkdistance = landmarkdistance;
	}
	@Override
	public String toString() {
		return "Landmark [landmarkname=" + landmarkname + ", landmarkdistance=" + landmarkdistance + "]";
	}
	
	
	
	

}
