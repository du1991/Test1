package com.j1702.db;
import java.sql.*;

public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc_test";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	private static Connection conn = null;
	// （static{}(即static块)，会在类被加载的时候执行且仅会被执行一次，一般用来初始化静态变量和调用静态方法，）
	static {
		try {
			// 1 加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2 获得数据的连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	// 静态方法获取连接
	public static Connection geConnection() {
		return conn;
	}
}
