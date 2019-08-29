package com.jm.eshoppe.vo;

public class User {

	private String userId;
	private String password;
	//private TypeOfUser typeOfUser;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public TypeOfUser getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(TypeOfUser typeOfUser) {
		this.typeOfUser = typeOfUser;
	}*/

	public User(String userId, String password, TypeOfUser typeOfUser) {
		super();
		this.userId = userId;
		this.password = password;
		//this.typeOfUser = typeOfUser;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + password  + "]";
	}

	public static void main(String args[]) {

		System.out.println("test.....");

		User user = new User("user1", "user1", TypeOfUser.PREMIUM);
		System.out.println(user.toString());

	}
}
