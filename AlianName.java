package com.java.practice.Alian;

import javax.persistence.Embeddable;

@Embeddable
public class AlianName {
	private String fName;
	private String lName;
	private String mName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "AlianName [fName=" + fName + ", lName=" + lName + ", mName=" + mName + "]";
	}
	public AlianName(String fName, String lName, String mName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.mName = mName;
	}
	public AlianName() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
