package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "DEPT")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Dept implements java.io.Serializable {

	private static final long serialVersionUID = 6980093847795726310L;
	
	@Id
	@Column(name = "DEPTNO", unique = true, nullable = false)
	private int deptno;
	
	@Column(name = "DNAME")
	private String dname;
	
	@Column(name = "LOC")
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Dept() {
		super();
		
	}
	
	
}
