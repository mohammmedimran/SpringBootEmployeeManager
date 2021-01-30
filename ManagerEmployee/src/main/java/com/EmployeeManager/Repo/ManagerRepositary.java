package com.EmployeeManager.Repo;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.EmployeeManager.DAO.Manager;

public interface ManagerRepositary extends CrudRepository<Manager,String>{
	@Query("SELECT mang FROM Manager mang WHERE mang.email = ?1 and mang.password = ?2")
	Manager findBookByuserNameandpassword(String email, String password);
}
