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

@WebServlet("/UpdateAddGoodsServlet")
public class UpdateAddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UpdateAddGoodsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int upid=Integer.parseInt(request.getParameter("updateid"));
		GoodsDao gd=new GoodsDao();
		Goods good=null;
		try {
			good=gd.selectById(upid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("LiGood", good);
		request.getRequestDispatcher("UpdateAddGoods.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
