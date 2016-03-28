package com.hhit.entity;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : User.java
//  @ Date : 2016/3/25
//  @ Author : 
//

public class User {
	private Integer id;
	private String userNum;
	private String password;
	private Integer isUsable;
	private String userType;
	private UserDetails userDetails;
	/**
	 * 默认构造函数,重载了则不可缺少
	 */
	public User(){
		
	}
	
	/**
	 * 构造函数，用户安装
	 */
	public User(String un,String pwd,
			Integer isU,String ut,UserDetails ud){
		userNum=un;
		password=pwd;
		isUsable=isU;
		userType=ut;
		userDetails=ud;
	}
	//构造函数，用户安装
	public User(String un,String pwd,
			Integer isU,String ut){
		userNum=un;
		password=pwd;
		isUsable=isU;
		userType=ut;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getIsUsable() {
		return isUsable;
	}
	public void setIsUsable(Integer isUsable) {
		this.isUsable = isUsable;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
