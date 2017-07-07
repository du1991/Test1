package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.j1702.db.DBUtil;
import com.j1702.model.User;

public class UserDao {
	// 修改（因为转账会发生 money 的增加或减少）
	public void updateUser(User u) throws SQLException {
		Connection conn = DBUtil.geConnection();
		String sql = "update User set money=? where name=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, u.getMoney());
		ptmt.setString(2, u.getName());
		ptmt.execute();
	}
	
	
	// 查询
	public User queryUser(String name) throws Exception {
		Connection conn = DBUtil.geConnection();
		String sql = "select * from User where name=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, name);
		ResultSet res = ptmt.executeQuery();
		User u = new User();
		while (res.next()) {
			u.setName(res.getString("name"));
			u.setMoney(res.getInt("money"));
		}
		return u;
	}
}