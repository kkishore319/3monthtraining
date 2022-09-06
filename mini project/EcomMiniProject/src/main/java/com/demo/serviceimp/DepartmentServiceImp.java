package com.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Department;
import com.demo.prodrepositary.DepartmentRepositary;
import com.demo.service.DepartmentService;

@Component
@Repository
public class DepartmentServiceImp implements DepartmentService {
	@Autowired
	DepartmentRepositary departRepo;

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departRepo.save(department);
	}
	



	




	
	


	
}
