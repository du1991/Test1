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
		String sql="insert into cart(goodsname,num,price) values(?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, gd.getName());
		ps.setInt(2, num);
		ps.setDouble(3, gd.getPrice());
		System.out.println("您本次选择了："+gd.getName()+","+"单价"+gd.getPrice()+",数量"+num);
		ps.executeUpdate();
	}
	
	public void selectCart() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from cart";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			System.out.println("商品编码："+rs.getInt("id")+"\t商品名称"+rs.getString("goodsname")
			+"\t商品数量"+rs.getInt("num")+"\t商品单价："+rs.getDouble("price"));
		}
	}
	
	
}
