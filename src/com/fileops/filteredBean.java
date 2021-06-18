package com.fileops;

public class filteredBean {
	
	private String userName;
	private String userJoiningDate;
	private int userID;
	
	public filteredBean(String userName,int userID) {
		super();
		this.userName=userName;
		this.userID=userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserJoiningDate() {
		return userJoiningDate;
	}
	public void setUserJoiningDate(String userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	

}
