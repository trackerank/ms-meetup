package com.ms.meetup.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ketchup_event")
public class Event implements Serializable{
	private static final long serialVersionUID = -7780610319328408540L;

	@Id
	@GeneratedValue
	@Column(name="event_id")
	private Long eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="event_location")
	private String eventLocation;
	
	@Column(name="event_start_time")
	private Date eventStartTime;
	
	@Column(name="event_end_time")
	private Date eventEndTime;
	
	@Column(name="event_desc")
	private String eventDesc;
	
	@Column(name="status")
	private String status;
	
	@Column(name="min_people")
	private Integer minPeople;
	
	@Column(name="maxPeople")
	private Integer maxPeople;
	
	@Column(name="user_id",insertable=true,updatable=true)
	private Long user_id;
	
	@Column(name="categoryId",insertable=true,updatable=true)
	private Long categoryId;
	
	@Column(name="location_id",insertable=true,updatable=true)
	private Long locationId;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public Date getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(Date eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public Date getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(Date eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMinPeople() {
		return minPeople;
	}

	public void setMinPeople(Integer minPeople) {
		this.minPeople = minPeople;
	}

	public Integer getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getEventId() {
		return eventId;
	}

}
