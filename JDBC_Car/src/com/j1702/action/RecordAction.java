package com.j1702.action;
import java.sql.SQLException;

import com.j1702.dao.RecordDao;

public class RecordAction {
	
	public void insert(String username,String shopname, Double money) throws SQLException{
		RecordDao rd=new RecordDao();
		rd.insert(username, shopname, money);
	}
}
