package com.zhiyou.model;

public class Admin {
	private Integer adminId;
	private String accounts;
	private String password;
	private String adminRemark;
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdminRemark() {
		return adminRemark;
	}
	public void setAdminRemark(String adminRemark) {
		this.adminRemark = adminRemark;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", accounts=" + accounts + ", password=" + password + ", adminRemark="
				+ adminRemark + "]";
	}
	public Admin(Integer adminId, String accounts, String password, String adminRemark) {
		super();
		this.adminId = adminId;
		this.accounts = accounts;
		this.password = password;
		this.adminRemark = adminRemark;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}



	



}
