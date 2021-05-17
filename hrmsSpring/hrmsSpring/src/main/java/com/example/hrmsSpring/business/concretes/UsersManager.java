package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.UsersService;
import com.example.hrmsSpring.dataAccess.abstracts.UsersDao;
import com.example.hrmsSpring.entities.concretes.Users;

@Service
public class UsersManager implements UsersService{

	private UsersDao userDao;

	@Autowired
	public UsersManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<Users> getAll() {
		return this.userDao.findAll();
	}
	
	
	
	
}
