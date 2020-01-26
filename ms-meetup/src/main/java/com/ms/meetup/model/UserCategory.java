package com.ms.meetup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_category")
public class UserCategory implements Serializable{
	private static final long serialVersionUID = -2141130250279822616L;

	@Id
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="category_id")
	private Long categoryId;
	
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
