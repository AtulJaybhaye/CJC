package com.cjc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.AdminLogin;

@Repository
public interface Dao extends CrudRepository<AdminLogin,Integer> {

}
