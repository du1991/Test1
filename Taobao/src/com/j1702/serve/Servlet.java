package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.GoodsDao;
import com.j1702.model.Goods;

@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public Servlet() {
        super();
    }

	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsDao gdd=new GoodsDao();
		List<Goods> li=null;
		try {
			li=gdd.getAllGoods();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("ListGoods", li);
		request.getRequestDispatcher("index1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
