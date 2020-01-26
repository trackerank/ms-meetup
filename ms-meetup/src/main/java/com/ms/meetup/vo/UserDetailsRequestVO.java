package com.ms.meetup.vo;

public class UserDetailsRequestVO {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long locationId;

	@Override
	public String toString() {
		return "UserDetailsRequestVO [username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", emailId=" + emailId + ", locationId=" + locationId + "]";
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	
}
