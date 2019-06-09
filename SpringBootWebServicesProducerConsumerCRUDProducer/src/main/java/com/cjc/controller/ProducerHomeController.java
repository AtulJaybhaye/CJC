package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.service.AdminService;

@RestController
public class ProducerHomeController {
	@Autowired
	private AdminService service;
	
	@PostMapping("/reg")
	public String Admin(@RequestBody com.cjc.model.AdminLogin admin) {
	
		service.addAdmin(admin);
		return "admin added successfully";
	}
	
	@GetMapping("/display")
	public List<com.cjc.model.AdminLogin> display()
	{
		List<com.cjc.model.AdminLogin> list=	service.display();
		return list;
		
	}
	@DeleteMapping("/delete/{id}")
	public List<com.cjc.model.AdminLogin> delete(@PathVariable int id)
	{     service.delete(id);
		List<com.cjc.model.AdminLogin> list=	service.display();
		return list;
		
	}
	@GetMapping("/edit/{id}")
	public com.cjc.model.AdminLogin edit(@PathVariable int id) {
		com.cjc.model.AdminLogin admin=service.edit(id);
		
		return admin;
	}
	
	@PutMapping("/update")
	public List<com.cjc.model.AdminLogin> update(@RequestBody com.cjc.model.AdminLogin admin)
	{   
		service.update(admin);
		List<com.cjc.model.AdminLogin> list=	service.display();
		return list;
		
	}
	
	
	

}
