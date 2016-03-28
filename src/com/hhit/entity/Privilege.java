package com.hhit.entity;

import java.util.Set;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Privilege.java
//  @ Date : 2016/3/25
//  @ Author : 
//
//




public class Privilege {
	private Integer id;
	private String url;
	private String privilegeName;
	
	private Privilege parent;
	private Set<Role> roles;
	private Set<Privilege> children;
	
	/**
	 * 默认构造函数,用户初始化，有重载则不可缺少
	 */
	public Privilege(){
		
	}
	/**
	 * 构造函数，用于安装
	 */
	public Privilege(String url,String priName,Privilege pri){
		this.url=url;
		this.privilegeName=priName;
		this.parent=pri;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public Privilege getParent() {
		return parent;
	}
	public void setParent(Privilege parent) {
		this.parent = parent;
	}
	public Set<Privilege> getChildren() {
		return children;
	}
	public void setChildren(Set<Privilege> children) {
		this.children = children;
	}

}
