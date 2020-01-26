package com.ms.meetup.vo;

import java.io.Serializable;

public class JwtResponseVO implements Serializable{
	private static final long serialVersionUID = 576420102963273073L;

	private final String jwttoken;

	public JwtResponseVO(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
