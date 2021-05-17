package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.SystemStaffService;
import com.example.hrmsSpring.dataAccess.abstracts.SystemStaffDao;
import com.example.hrmsSpring.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{

	private SystemStaffDao systemStaffDao;

	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public List<SystemStaff> getAll() {
		return this.systemStaffDao.findAll();
	}
	
	
	
}
