package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.j1702.dbcp.DBCP;
import com.j1702.model.Goods;

public class CarDao {

	public void upadte(int id,int num) throws SQLException{
		Connection co=DBCP.getConnection();
		GoodsDao gdd=new GoodsDao();
		Goods gd=gdd.selectById(id);
		String sql="insert cart(goodsname,num,price) values(?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, gd.getName());
		ps.setInt(2, num);
		ps.setDouble(3, gd.getPrice());
		ps.execute();
	}
}
