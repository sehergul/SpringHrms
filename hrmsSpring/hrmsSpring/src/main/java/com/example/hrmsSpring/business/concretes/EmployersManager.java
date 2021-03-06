package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.EmployersService;
import com.example.hrmsSpring.dataAccess.abstracts.EmployersDao;
import com.example.hrmsSpring.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;

	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}
	

	
	
}
