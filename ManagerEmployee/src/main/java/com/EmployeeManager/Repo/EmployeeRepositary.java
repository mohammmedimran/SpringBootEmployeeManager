package com.EmployeeManager.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManager.DAO.Employee;


@Repository
public interface EmployeeRepositary extends CrudRepository<Employee,Integer> {

}

