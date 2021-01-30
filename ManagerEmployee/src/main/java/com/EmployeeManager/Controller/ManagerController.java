package com.EmployeeManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManager.DAO.Employee;
import com.EmployeeManager.DAO.Manager;
import com.EmployeeManager.Service.ManagerService;
@CrossOrigin("http://localhost:4200")
@RequestMapping("/Manager")
@RestController
public class ManagerController {

	@Autowired 
	ManagerService managerService;
	
	@PostMapping("/createManager")
	public void createManager(@RequestBody Manager manager) {
		managerService.createManager(manager);
	}
	
	@GetMapping("/checkLogin/{userName}/{password}")
		public boolean checkLogin(@PathVariable String userName,@PathVariable String password) {
			return managerService.checkLogin(userName,password);
		}
	
}
