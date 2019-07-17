package com.demo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Dept;
import com.demo.service.DeptService;

import tools.ToTable;

@Controller
@RequestMapping("/dept")
public class DeptController {

	private static final Logger LOGGER = Logger.getLogger(DeptController.class);
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<Dept> showUserInfos(){
		LOGGER.info("查询用户全部用户");
		List<Dept> deptInfos = deptService.findAll();
		return deptInfos;
	}
	
	@RequestMapping("/tableInfos")
	public @ResponseBody ToTable tableInfos(){
		ToTable t = new ToTable();
		List<Dept> data = showUserInfos();
		t.setCount(data.size());
		t.setData(data);
		return t;
	}
}
