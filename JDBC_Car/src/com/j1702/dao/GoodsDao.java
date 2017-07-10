package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.j1702.dbcp.DBCP;
import com.j1702.model.Goods;

public class GoodsDao {

	public void selectGoods() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from goods";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		System.out.println("商品编码："+rs.getInt("id")+"\t商品名:"+rs.getString("name")+"\t价格："+rs.getDouble("price")+"\t生产厂家"
				+ "："+rs.getString("factory")+"\t生产日期："+rs.getString("dateTime")+"\t库存："
						+ rs.getInt("quantity"));}
	}
	
	public Goods selectById(int id) throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from goods where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Goods gd=new Goods(id);
		while(rs.next()){
		gd.setName(rs.getString("name"));
		gd.setPrice(rs.getDouble("price"));
		}
		return gd;
	}
}
