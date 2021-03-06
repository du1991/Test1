package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j1702.dbcp.DBCP;
import com.j1702.model.Goods;

public class GoodsDao {

	public List<Goods> selectGoods() throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="select * from goods";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Goods> li=new ArrayList<>();
		while(rs.next()){
			Goods gd=new Goods();
			gd.setId(rs.getInt("id"));
			li.add(gd);
		System.out.println("商品编码："+rs.getInt("id")+"\t商品名:"+rs.getString("name")+"\t价格："+rs.getDouble("price")+"\t生产厂家"
				+ "："+rs.getString("factory")+"\t生产日期："+rs.getString("dateTime")+"\t库存："
						+ rs.getInt("quantity"));}
		return li;
	}
	
	public Goods selectById(int id) throws SQLException{ //action层不需要写
		Connection co=DBCP.getConnection();
		String sql="select * from goods where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Goods gd=new Goods(id);
		while(rs.next()){
		gd.setName(rs.getString("name"));
		gd.setPrice(rs.getDouble("price"));
		gd.setQuantity(rs.getInt("quantity"));
		}
		return gd;
	}
	
	public void updateGoodsNum(int id,int num) throws SQLException{
		Connection co=DBCP.getConnection();
		String sql="update goods set quantity=? where id=?";
		PreparedStatement ps= co.prepareStatement(sql);
		ps.setInt(1, selectById(id).getQuantity()-num);
		ps.setInt(2, id);
		ps.execute();
	}
	
}
