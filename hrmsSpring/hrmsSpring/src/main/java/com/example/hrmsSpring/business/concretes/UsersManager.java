package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.UsersService;
import com.example.hrmsSpring.dataAccess.abstracts.UsersDao;
import com.example.hrmsSpring.entities.concretes.Users;

@Service //business gorevini gorecek katman icin kullanilir
public class UsersManager implements UsersService{

	
	/*  @Autowired bunun ustune de yazilabilirdi
	fakat birden fazla dependency injection olabilecegi icin
	constructor ustune yazilir */	
	private UsersDao userDao;

	
	//autowired: injection yapar- karşılığı olan sınıfı bulup enjekte ediyor
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
