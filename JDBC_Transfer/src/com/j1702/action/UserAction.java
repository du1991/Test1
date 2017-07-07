package com.j1702.action;

import java.sql.SQLException;

import com.j1702.dao.UserDao;
import com.j1702.model.User;

public class UserAction {

	public User query(String name) throws Exception{
		UserDao dao = new UserDao();
		return dao.queryUser(name);	
	}
	
	public void update(User u) throws SQLException{
		UserDao dao = new UserDao();
		dao.updateUser(u);
	}
}
