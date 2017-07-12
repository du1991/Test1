package com.j1702.dao;

import java.sql.*;

import com.j1702.dbcp.DBCP;

public class RecordDao {
	
	public void insert(String username,String shopname,Double money) throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="insert record(username,shopname,money) values(?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, shopname);
		ps.setDouble(3, money);
		ps.execute();
	}
}
