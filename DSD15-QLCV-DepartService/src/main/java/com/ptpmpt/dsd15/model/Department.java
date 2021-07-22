package com.ptpmpt.dsd15.model;

public class Department {
	
	private String Depart_ID;
	private String Depart_Name;
	private String Depart_Des;
	public String getDepart_ID() {
		return Depart_ID;
	}
	public void setDepart_ID(String depart_ID) {
		Depart_ID = depart_ID;
	}
	public String getDepart_Name() {
		return Depart_Name;
	}
	public void setDepart_Name(String depart_Name) {
		Depart_Name = depart_Name;
	}
	public String getDepart_Des() {
		return Depart_Des;
	}
	public void setDepart_Des(String depart_Des) {
		Depart_Des = depart_Des;
	}
	@Override
	public String toString() {
		return "Department [Depart_ID=" + Depart_ID + ", Depart_Name=" + Depart_Name + ", Depart_Des=" + Depart_Des
				+ "]";
	}
	

}
