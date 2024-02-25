package com.apiTest.apiTest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiTest.apiTest.DAO.IUser;
import com.apiTest.apiTest.model.users;

@RestController
public class userController {
	@Autowired
	private IUser dao;

	@GetMapping("/users")
	public List<users> listaUsers() {
		return (List<users>) dao.findAll();
	}
}
