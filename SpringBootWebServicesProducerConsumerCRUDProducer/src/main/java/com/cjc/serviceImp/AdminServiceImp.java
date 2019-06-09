package com.cjc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.Dao;
import com.cjc.model.AdminLogin;
import com.cjc.service.AdminService;
@Service
public class AdminServiceImp implements AdminService{
   @Autowired
	private Dao dao;
	@Override
	public void addAdmin(AdminLogin admin) {
		dao.save(admin);
	}

	@Override
	public List<AdminLogin> display() {
		List<AdminLogin> list=(List<AdminLogin>) dao.findAll();
		return list;
	}

	@Override
	public int delete(int id) {
		dao.deleteById(id);
		return 0;
	}

	@Override
	public AdminLogin edit(int id) {
		AdminLogin admin=dao.findById(id).get();
		return admin;
	}

	@Override
	public int update(AdminLogin admin) {
		dao.save(admin);
		return 0;
	}

}
