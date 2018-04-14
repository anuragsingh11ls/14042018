package com.anu.usermanagement.user.daoimpl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.impl.AbstractDaoImpl;
import com.anu.usermanagement.user.dao.UserDao;
import com.anu.usermanagement.user.entitys.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao 
{

	public UserDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}

	public void addUser(User user) {
		saveOrUpdate(user);
		
	}

	
}
