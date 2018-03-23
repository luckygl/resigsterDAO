package com.keen.service;

import javax.annotation.Resource;

import com.keen.DAO.UserDAO;
import com.keen.model.User;

public class UserService {
	
	UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource (name="userdao")		//后面吧J2ee的annotation的包加进来，在xml里配置一下。
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(User u) {		
		if(userDAO != null) {
			userDAO.addUser(u);
		}
//		System.out.println("插入User U");
	}
}
