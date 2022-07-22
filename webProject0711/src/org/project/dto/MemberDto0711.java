package org.project.dto;

public class MemberDto0711 {
	private String userId;
	private int userAge;
	private String userName;

	public MemberDto0711(String userId, int userAge, String userName) {
		super();
		this.userId = userId;
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
