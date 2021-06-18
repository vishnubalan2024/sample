package com.fileops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestBean {

	
	private int id;
	private String employeeName;
	private Date employeeJoiningDate;
	private String employeeStatus;
	private String employeeTechStack;
	
	private List<filteredBean> employeeDetails=new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(Date employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public String getEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public String getEmployeeTechStack() {
		return employeeTechStack;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestBean other = (TestBean) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public void setEmployeeTechStack(String employeeTechStack) {
		this.employeeTechStack = employeeTechStack;
	}
	public List<filteredBean> getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(List<filteredBean> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	
	   
}
