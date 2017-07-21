package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.CartsDao;
import com.j1702.model.Carts;
import com.j1702.model.Users;

@WebServlet("/CartServletOri")
public class CartServletOri extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CartServletOri() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Users us=(Users)request.getSession().getAttribute("ss");
		CartsDao cd=new CartsDao();
		List<Carts> li=null;
		try {
			 li=cd.selectByUserId(us);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("cartgoods", li);
		request.getRequestDispatcher("Cart.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
