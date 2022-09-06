package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Department;
import com.demo.serviceimp.DepartmentServiceImp;

@RestController
@RequestMapping
public class DepartmentController {

	@Autowired
	DepartmentServiceImp departServ;

	@PostMapping
	public Department addDepartment(@RequestBody Department department) {

		Department dep = departServ.addDepartment(department);
		return dep;

	}

}
