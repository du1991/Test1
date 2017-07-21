package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DB;
import com.j1702.model.Users;

public class UsersDao {
	
	public List<Users> selectAll() throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Users";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Users> li=new ArrayList<Users>();
		while(rs.next()){
			Users u=new Users();
			u.setId(rs.getInt("id"));
			u.setMoney(rs.getFloat("money"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			li.add(u);
		}
		return li;
	}
	
	public void insertUser(Users us) throws SQLException{
		Connection co=DB.getConnection();
		String sql="insert Users(username,password) values(?,?) ";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, us.getUsername());
		ps.setString(2, us.getPassword());
		ps.execute();
	}
	
}
