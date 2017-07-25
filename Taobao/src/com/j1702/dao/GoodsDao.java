package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DB;
import com.j1702.model.Goods;

public class GoodsDao {
	
	
	public  List<Goods> getAllGoods(int nowpage) throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Goods limit ?,10";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, (nowpage-1)*10);
		ResultSet rs=ps.executeQuery();
		List<Goods> li=new ArrayList<Goods>();
		while(rs.next()){
			Goods gd=new Goods();
			gd.setId(rs.getInt("id"));
			gd.setName(rs.getString("name"));
			gd.setNum(rs.getInt("num"));
			gd.setPrice(rs.getFloat("price"));
			gd.setPicture(rs.getString("picture"));
			gd.setLowprice(rs.getFloat("lowprice"));
			gd.setGoodexplain(rs.getString("goodexplain"));
			gd.setLowpriceexplain(rs.getString("lowpriceexplain"));
			li.add(gd);
		}
		rs.close();
		return li;
	} 
	
	public Goods selectById(int id) throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Goods where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Goods gd=new Goods();
		while(rs.next()){
			gd.setId(rs.getInt("id"));
			gd.setName(rs.getNString("name"));
			gd.setNum(rs.getInt("num"));
			gd.setPicture(rs.getString("picture"));//测试一下顺序和数据库不一样时有没误差
			gd.setPrice(rs.getFloat("price"));
			gd.setLowprice(rs.getFloat("lowprice"));
			gd.setGoodexplain(rs.getString("goodexplain"));
			gd.setLowpriceexplain(rs.getString("lowpriceexplain"));
		}
		return gd;
	}
	
	public int selectCount() throws SQLException{
		Connection co=DB.getConnection();
		String sql="select count(*) from Goods";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		int count=0;
		while(rs.next()){
		count = rs.getInt(1);}
		rs.close();
		return count;
	}
	
	public void insert(Goods g) throws SQLException{
		Connection co=DB.getConnection();
		String sql="insert Goods(name,num,price,picture,lowprice,goodexplain,lowpriceexplain) values(?,?,?,?,?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, g.getName());
		ps.setInt(2, g.getNum());
		ps.setFloat(3, g.getPrice());
		ps.setString(4, g.getPicture());
		ps.setFloat(5, g.getLowprice());
		ps.setString(6, g.getGoodexplain());
		ps.setString(7, g.getLowpriceexplain());
		ps.execute();
		
		
	
	}
	
	public void updateById(Goods g) throws SQLException{
		Connection co=DB.getConnection();
		String sql="update Goods set num=?,price=?,lowprice=?,picture=? where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, g.getNum());
		ps.setFloat(2, g.getPrice());
		ps.setFloat(3, g.getLowprice());
		ps.setString(4, g.getPicture());
		ps.setInt(5, g.getId());
		ps.execute();
	}
	
	public  void delete(Goods gd) throws SQLException{
		Connection co=DB.getConnection();
		String sql="delete from Goods where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, gd.getId());
		ps.execute();
	}
	
}
