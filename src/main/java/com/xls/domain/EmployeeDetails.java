package com.xls.domain;

public class EmployeeDetails {

	private int employeeUId;
	private String employeeName;
	private String month;
	private int year;
	private int week1;
	private int week2;
	private int week3;
	private int week4;
	private int week5;
	private boolean isBillable;
	private int regionId;
	
	
	public int getEmployeeUId() {
		return employeeUId;
	}
	public void setEmployeeUId(int employeeUId) {
		this.employeeUId = employeeUId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getWeek1() {
		return week1;
	}
	public void setWeek1(int week1) {
		this.week1 = week1;
	}
	public int getWeek2() {
		return week2;
	}
	public void setWeek2(int week2) {
		this.week2 = week2;
	}
	public int getWeek3() {
		return week3;
	}
	public void setWeek3(int week3) {
		this.week3 = week3;
	}
	public int getWeek4() {
		return week4;
	}
	public void setWeek4(int week4) {
		this.week4 = week4;
	}
	public int getWeek5() {
		return week5;
	}
	public void setWeek5(int week5) {
		this.week5 = week5;
	}
	public boolean isBillable() {
		return isBillable;
	}
	public void setBillable(boolean isBillable) {
		this.isBillable = isBillable;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [employeeUId=" + employeeUId + ", employeeName=" + employeeName + ", month=" + month
				+ ", year=" + year + ", week1=" + week1 + ", week2=" + week2 + ", week3=" + week3 + ", week4=" + week4
				+ ", week5=" + week5 + ", isBillable=" + isBillable + ", regionId=" + regionId + "]";
	}
	
}
