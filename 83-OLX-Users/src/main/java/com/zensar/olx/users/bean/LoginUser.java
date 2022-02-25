package com.zensar.olx.users.bean;

import java.util.Objects;

public class LoginUser {
	private String userName;
	private String password;
	
	public LoginUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public LoginUser() {
		super();
	}

	public LoginUser(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LoginUser))
			return false;
		LoginUser other = (LoginUser) obj;
		return Objects.equals(userName, other.userName);
	}
	
	
}
