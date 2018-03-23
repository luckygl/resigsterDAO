package com.keen.model;
import com.keen.DAO.UserDAO;

public class UserDaoImp  implements UserDAO {

	private int UserDaoid;
	
	public int getUserDaoid() {
		return UserDaoid;
	}

	public void setUserDaoid(int userDaoid) {
		UserDaoid = userDaoid;
	}

	@Override
	public void addUser(User u) {
		System.out.println("在数据库中插入User u信息");
		System.out.println("UserDaoid" + UserDaoid);
	}
	
}
