package com.ms.meetup.vo;

import java.io.Serializable;

public class UserAuthenticationRequestVO implements Serializable{
	private static final long serialVersionUID = -4756599736954768946L;
	
	private String username;
	private String password;
	
	public UserAuthenticationRequestVO() {
		
	}
	
	public UserAuthenticationRequestVO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
