package com.cjc.service;

import java.util.List;

import com.cjc.model.AdminLogin;

public interface AdminService {
	
	//public void addAdmin() ;
	public List<AdminLogin> display();
	public int delete(int id);
	public AdminLogin edit(int id);
	public int update(AdminLogin admin);
	public void addAdmin(AdminLogin admin);
		
		
	

}
