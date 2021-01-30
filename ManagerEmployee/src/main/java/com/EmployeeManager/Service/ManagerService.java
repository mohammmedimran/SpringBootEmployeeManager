package com.EmployeeManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManager.DAO.Manager;
import com.EmployeeManager.Repo.ManagerRepositary;

@Service
public class ManagerService {

	@Autowired 
	ManagerRepositary managerRepo;
	

	public void createManager(Manager manager) {
	managerRepo.save(manager);
		
	}


	


	public boolean checkLogin(String userName, String password) {
		System.out.println(managerRepo.findById(userName));
			
				if(managerRepo.findBookByuserNameandpassword(userName, password)==null) {
					return false;
				}else {
					return true;
				}
//		/System.out.println(managerRepo.findBookByuserNameandpassword(userName, password)+"========");
//		return false;
		
}
}
