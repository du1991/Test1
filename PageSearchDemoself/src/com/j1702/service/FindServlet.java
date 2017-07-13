package com.j1702.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.BookDao;
import com.j1702.model.Book;

@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FindServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nowpagestr=request.getParameter("nowpage");
		int nowpage = 1;
		if(nowpagestr!=null){
			nowpage= Integer.parseInt(nowpagestr);}
		BookDao bd=new BookDao();
		List<Book> li=new ArrayList<Book>();
		try {
			li=bd.selectBook(nowpage);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("nowpage", nowpage);
		request.setAttribute("BookData", li);
		request.getRequestDispatcher("index.jsp").forward(request, response); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
