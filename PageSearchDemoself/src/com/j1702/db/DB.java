package com.j1702.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB{
	static String url="jdbc:mysql://127.0.0.1:3306/servlet?useSSL=false";
	static String user="root";
	static String password="";
	static Connection co=null;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co=DriverManager.getConnection(url,user,password);
		} 
		catch (ClassNotFoundException e) {	
			System.out.println("数据库class丢失");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("驱动链接失败");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return co;
	}
}

