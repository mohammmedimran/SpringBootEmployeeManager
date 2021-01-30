package com.EmployeeManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManager.DAO.Employee;
import com.EmployeeManager.Service.EmployeeService;


@CrossOrigin("http://localhost:4200")

@RequestMapping("/Employee")
@RestController
public class EmployeeController {

	 

@Autowired
EmployeeService empService;
	@GetMapping("/getAllEmployee")
	public List<Employee> getAll(){
		return empService.getEmployees();
	}
	
	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		empService.create(employee);
	}

	@DeleteMapping("/delete/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		empService.deleteEmployee(empid);
	}

	 @PutMapping("/update/{empId}")
	 public void update(@RequestBody Employee employee,@PathVariable int empId) {
		 System.out.println("-----------"+employee+"==========="+empId);
		  empService.updateEmployee(employee, empId);
	 }
}
