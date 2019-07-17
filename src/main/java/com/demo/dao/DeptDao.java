package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Dept;

@Repository("deptDao")
public class DeptDao {

	@Autowired
	private SessionFactory sessionFactory;
 
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public Dept get(String id) {
		return (Dept) this.getCurrentSession().get(Dept.class, id);
	}
	public List<Dept> findAll() {
		List<Dept> Dept = this.getCurrentSession().createQuery("from Dept").setCacheable(true).list();
		return Dept;
	}
	
}
