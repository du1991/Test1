package com.j1702.action;

import java.sql.SQLException;

import com.j1702.dao.UsersDao;

public class UsersAction {

	public void updateAcount(Double total,String name) throws SQLException{
		UsersDao ud=new UsersDao();
		ud.updateAcount(total,name);
	}
}
