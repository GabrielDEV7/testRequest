package com.apiTest.apiTest.DAO;

import org.springframework.data.repository.CrudRepository;

import com.apiTest.apiTest.model.users;

public interface IUser extends CrudRepository<users, Integer >{
	

}
