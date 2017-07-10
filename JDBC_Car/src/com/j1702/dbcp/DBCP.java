package com.j1702.dbcp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;



public class DBCP {
	private static Properties pr=new Properties();
	private static DataSource ds;
	
	static{
		try {
			FileInputStream fis=new FileInputStream("config/dbcp.properties");
			pr.load(fis);
			ds=BasicDataSourceFactory.createDataSource(pr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection co=null;
		try {
			co=ds.getConnection();
//			co.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return co;
	}
}
