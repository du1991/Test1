package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.j1702.dao.UsersDao;
import com.j1702.model.Users;

@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UsersServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username=request.getParameter("username");
		response.setContentType("text/html; charset=UTF-8");
		String password=request.getParameter("password");
		UsersDao ud=new UsersDao();
		int count=0;
		List<Users> li=null;
		try {
			li=ud.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.getWriter().write(1);
		if(li!=null){
		for(Users u:li){
			if(u.getUsername().equals(username)&&u.getPassword().equals(password)){
				request.getSession().setAttribute("ss", u);
				request.getRequestDispatcher("Servlet").forward(request, response);
				count++;
			}
		}}
		if(count==0){
			response.getWriter().write("登录失败！请检查账户和密码，没有账号请先注册！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
