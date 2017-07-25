package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DB;
import com.j1702.model.Carts;
import com.j1702.model.Users;

public class CartsDao {
	
	public void delete(Carts ca) throws SQLException{
		Connection co=DB.getConnection();
		String sql="delete from Carts where id=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, ca.getId());
		ps.execute();
	}
	
	public void insert(Carts ca) throws SQLException{
		Connection co=DB.getConnection();
		String sql="insert Carts(picture,price,lowprice,buynum,totalmoney,userid,num,goodsname) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setString(1, ca.getPicture());
		ps.setFloat(2, ca.getPrice());
		ps.setFloat(3, ca.getLowprice());
		ps.setInt(4, ca.getBuynum());
		ps.setFloat(5, ca.getTotalmoney());
		ps.setInt(6, ca.getUserid());
		ps.setInt(7, ca.getNum());
		ps.setString(8, ca.getGoodsname());
		ps.execute();
		
	}
	
	public static List<Carts> selectByUserId(Users us) throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Carts where userid=?";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, us.getId());
		ResultSet rs=ps.executeQuery();
		List<Carts> li=new ArrayList<Carts>();
		while(rs.next()){
			Carts ca=new Carts();
			ca.setBuynum(rs.getInt("buynum"));
			ca.setId(rs.getInt("id"));
			ca.setLowprice(rs.getFloat("lowprice"));
			ca.setPicture(rs.getString("picture"));
			ca.setPrice(rs.getFloat("price"));
			ca.setTotalmoney(rs.getFloat("totalmoney"));
			ca.setUserid(rs.getInt("userid"));
			ca.setTime(rs.getString("optime"));
			ca.setNum(rs.getInt("num"));
			ca.setGoodsname(rs.getString("goodsname"));
			li.add(ca);
		}
		return li;
	}
}
