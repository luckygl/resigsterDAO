package com.keen.service;

import javax.annotation.Resource;

import com.keen.DAO.UserDAO;
import com.keen.model.User;

public class UserService {
	
	UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource (name="userdao")		//�����J2ee��annotation�İ��ӽ�������xml������һ�¡�
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(User u) {		
		if(userDAO != null) {
			userDAO.addUser(u);
		}
//		System.out.println("����User U");
	}
}
