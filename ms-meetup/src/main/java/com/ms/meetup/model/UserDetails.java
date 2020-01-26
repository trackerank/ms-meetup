package com.ms.meetup.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails implements Serializable{
	private static final long serialVersionUID = -4942349360302993720L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="location_id",insertable=true,updatable=true)
	private Long locationId;

	@OneToOne
	@JoinColumn(name="location_id",insertable=false,updatable=false)
	private Location location;
	
	@OneToMany
	@JoinColumn(name="user_id",insertable=false,updatable=false)
	private List<UserCategory> userCategories;

	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Location getLocation() {
		return location;
	}
	
	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public List<UserCategory> getUserCategories() {
		return userCategories;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserDetails() {	}

	public UserDetails(String username, String firstName, String lastName, String emailId, Long locationId) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.locationId = locationId;
	}

}
