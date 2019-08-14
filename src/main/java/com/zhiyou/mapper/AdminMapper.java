package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Admin;

public interface AdminMapper {
	List<Admin> SelectByAccounts(String accounts);
	List<Admin> SelectByAdminId(int adminId);
	List<Admin> SelectAll();
	List<Admin> SelectAllLimit(int page,int number);
	
	void add(Admin admin);
	void delete(int adminId);
	void update(Admin admin);
}
