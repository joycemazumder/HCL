package com.jm.eshoppe.vo;

public enum TypeOfUser { 	
	REGULAR("Regular User"),
	STANDARD("Standard User"),
	PREMIUM("Premium User");
	
	private String userType;

	private TypeOfUser(String userType) {
		this.userType = userType;
	}
	
	public String getUser()
	{
		return this.userType;
	}
}
