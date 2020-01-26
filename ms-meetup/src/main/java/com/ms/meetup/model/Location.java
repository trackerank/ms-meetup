package com.ms.meetup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location implements Serializable{
	private static final long serialVersionUID = -8398214925854918364L;

	@Id
	@GeneratedValue
	@Column(name="location_id")
	private String locationId;
	
	@Column(name="location_name")
	private String locationName;
	
	@Column(name="location_desc")
	private String locationdesc;

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationdesc() {
		return locationdesc;
	}

	public void setLocationdesc(String locationdesc) {
		this.locationdesc = locationdesc;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", locationdesc="
				+ locationdesc + "]";
	}

}
