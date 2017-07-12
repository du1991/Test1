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
		String sql="insert into cart(goodsname,num,price,total) values(?,?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, gd.getName());
		ps.setInt(2, num);
		ps.setDouble(3, gd.getPrice());
		ps.setDouble(4, num*gd.getPrice());
		System.out.println("您本次选择了："+gd.getName()+","+"单价"+gd.getPrice()+",数量"+num
				+"总价"+num*gd.getPrice());
		ps.executeUpdate();
	}
	
	public void selectCart() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from cart";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		if(!rs.next()){System.out.println("购物车空无一物，请您先添加商品至购物车！");}
		else{System.out.println("商品名称:"+rs.getString("goodsname")
			+"\t商品数量:"+rs.getInt("num")+"\t商品单价:"+rs.getDouble("price"));}
		while(rs.next()){
			System.out.println("商品名称:"+rs.getString("goodsname")
			+"\t商品数量:"+rs.getInt("num")+"\t商品单价:"+rs.getDouble("price"));
		}
	}
	
	public Double total() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from cart";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		Double sum=0.0;
		while(rs.next()){
			sum+=rs.getDouble("total");
		}
		 return sum;
	}
	
	public void delete() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="delete from cart";
		PreparedStatement ps= co.prepareStatement(sql);
		ps.execute();
	}
}
