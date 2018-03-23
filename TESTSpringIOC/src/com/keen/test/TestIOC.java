package com.keen.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keen.DAO.UserDAO;
import com.keen.model.User;
import com.keen.model.UserDaoImp;
import com.keen.service.UserService;

public class TestIOC {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");	//xml���漰�����������
		UserService uSer = context.getBean("userservice",UserService.class);
		User u = new User();
		uSer.addUser(u);

		
//		User u = new User();
//		UserService uSer = new UserService();
//		UserDAO uDao = new UserDaoImp();   //���ÿ�ܵĻ������Ѿ�������ӿڱ���ˡ�
//		uSer.setUserDAO(uDao);
//		uSer.addUser(u);
	}
	
}
