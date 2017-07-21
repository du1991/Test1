package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.GoodsDao;
import com.j1702.model.Goods;

@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int gd=Integer.parseInt(request.getParameter("DetailGoodId"));
		GoodsDao gdd=new GoodsDao();
		Goods detailGood= null;
		try {
			detailGood=gdd.selectById(gd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("detailGood", detailGood);
		request.getRequestDispatcher("Detail.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
