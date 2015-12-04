package com.jbuilder.master.entity;

import java.util.Date;

/**
 * @author wangfujun
 * @version 1.0
 */
public class User {
	
	private Long userId;
	
	private String userName;
	
	private String email;
	
	private String mobile;
	
	private Date createDate;
	
	private Integer state;

	//----------------------------------
	//getters and setters
	//----------------------------------
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
