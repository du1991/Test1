package com.j1702.dao;
import java.sql.*;

import com.j1702.dbcp.DBCP;
import com.j1702.model.Users;

public class UsersDao {
	
	public void updateAcount(Double total,String name) throws SQLException{
		Users us= select(name);
		Connection co=DBCP.getConnection();
		String sql="update Users set acount=? where name=? ";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setDouble(1, us.getAcount()-total);
		ps.setString(2, name);
		ps.execute();
	}
	
	public Users select(String name) throws SQLException{//不用谢action
		Connection co=DBCP.getConnection();
		String sql="select * from Users where name=? ";
		PreparedStatement ps= co.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		Users us=new Users();
		while(rs.next()){
			us.setAcount(rs.getDouble("acount"));
		}
		return us;
	}
}
