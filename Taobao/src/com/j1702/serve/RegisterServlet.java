package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.UsersDao;
import com.j1702.model.Users;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		String clause=request.getParameter("clause");
		response.setContentType("text/html;charset=UTF-8");
		
		int count=0;
		UsersDao ud=new UsersDao();
		List<Users> li=null;
		try {
			li=ud.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Users u:li){
			if(u.getUsername().equals(username)){
				response.getWriter().write("该名字已存在，请更换名字");
				count++;
			}
		}
		if(count==0){
			if(password.equals(repassword)){
				if(clause!=null){
					Users us=new Users();
					us.setPassword(repassword);
					us.setUsername(username);
					try {
						ud.insertUser(us);
						response.getWriter().write("注册成功！请返回登录！");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else{response.getWriter().write("你没有同意协议!");}
			}
			else{
				response.getWriter().write("两次密码不一样！请重新输入");
			}
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
