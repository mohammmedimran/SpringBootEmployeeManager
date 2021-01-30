package com.EmployeeManager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManager.DAO.Employee;
import com.EmployeeManager.Repo.EmployeeRepositary;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepositary empRepo;
	
	//Creating Employee Object

	public void create(Employee employee) {
		empRepo.save(employee);
	}

	
	
	public List<Employee> getEmployees() {
		return (List<Employee>) empRepo.findAll();
	}

	public void updateEmployee(Employee employee, int empId) {
       employee.setEmpid(empId);
		empRepo.save(employee);
		
	}



	public void deleteEmployee(int empid) {
		empRepo.deleteById(empid);
		
	}
	
	
	
	

}
