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
		System.out.println("�����ݿ��в���User u��Ϣ");
		System.out.println("UserDaoid" + UserDaoid);
	}
	
}
