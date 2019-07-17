package com.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.DeptDao;
import com.demo.entity.Dept;

@Service("deptService")
@Transactional
public class DeptService {

	@Autowired
	private DeptDao deptDao;
	
	public Dept get(String id) {
		return deptDao.get(id);
	}
	
	public List<Dept> findAll() {
		return deptDao.findAll();
	}
}
