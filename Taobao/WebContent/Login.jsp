<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<style>
html, body {
	height: 100%;
	margin: 0
}

.div1 {
	height: 75%;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/TB1bvEOSXXXXXb0aXXXXXXXXXXX-2500-600.jpg);
	background-size: cover;
	background-position: -600px;
}

.div2 {
	height: 10%;
	background-color: darkkhaki
}

.div3 {
	height: 15%;
	background-color: antiquewhite
}

.div4 {
	height: 100%;
	width: 190px;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);
}

.div1>div {
	background-color: azure;
	width: 400px;
	height: 400px;
	position: absolute;
	left: 70%;
	top: 20%
}

table, form {

	width: 100%;
	height: 100%
}



.td1 {
	font-size: 30px;
	text-align: center;
	column-span: "2"
}



td {
	text-align: center;
	font-size: 25px;

	
}

input {
	height: 40px;
	width: 210px;
	font-size: 17px
}

button {
	height: 40px;
	font-size: 25px;
}

a {
	text-decoration: none
}
</style>
</head>
<body>
<% int a=0;if(request.getAttribute("er")!=null){a=(int)request.getAttribute("er");} %>
	<div class="div2">
		<div class="div4"></div>
	</div>
	<div class="div1">
		<div>
			<form action="UsersServlet" method="post">
				<table>
					
					<tr>
						<td class="td1" colspan="2">用户登录</td>
					</tr>
					<tr>
						<td>用户名:</td>
						<td><input type="text" placeholder="会员名/邮箱/手机号"
							name="username"></td>
					</tr>
					<tr>
						<td>密&nbsp;&nbsp;&nbsp;码:</td>
						<td><input type="password" placeholder="请输入密码"
							name="password"></td>
					</tr>
					<% if(a==1){ %>
					<tr>
						<td colspan="2" style="color:red;font-size:17px;text-align:left;height:38px"><%= "密码或账户有误"%></td>
					</tr>
					<%} else{%>
					<tr ><td style="display: none;height:38px">s</td></tr>
					<%} %>
					<tr>
						<td><button type="submit">登录</button></td>
						<td>
							<button>
								<a href="Register.jsp">免费注册</a>
							</button>
						</td>
					</tr>
				</table>
			</form>
		</div>

	</div>
	<div class="div3"></div>
</body>
</html>