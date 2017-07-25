<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<style>
html, body {
	height: 100%;
	margin: 0
}

.div1 {
	height: 75%;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/974C2CA5-6584-4372-96EC-7C812DF44778.png);
	background-size: cover;
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

.td2 {
	font-size: 17px;
	text-align: left
}

.td3 {
	text-align: right;
	line-height: 10px
}

.td4 {
	text-align: right
}



td {
	text-align: center;
	font-size: 25px
}

.input {
	height: 40px;
	width: 210px;
	font-size: 17px
}

button {
	height: 40px;
	font-size: 25px;
}
</style>
</head>
<body>
<% int a=0; if(request.getAttribute("dou")!=null) { a=(int)request.getAttribute("dou");} %>
	<div class="div2">
		<div class="div4"></div>
	</div>
	<div class="div1">
		<div>

			<form action="RegisterServlet">
				<table>

					<tr>
						<td class="td1" colspan="2">用户注册</td>
					</tr>
					<tr>
						<td>用户名:</td>
						<td><input type="text" class="input" placeholder="会员名/邮箱/手机号"
							name="username"></td>
					</tr>
					<tr>
						<td>密&nbsp;&nbsp;&nbsp;码:</td>
						<td><input class="input" type="password" placeholder="请输入密码"
							name="password"></td>
					</tr>
					<tr>
						<td style="font-size: 16px">再次输入密码:</td>
						<td><input type="password" class="input"
							placeholder="请再次输入密码" name="repassword"></td>
					</tr>
					<tr>
						<td class="td3"><input type="checkbox" value="clause"
							name="clause"></td>
						<td class="td2">霸王条款
						<% if(a==1){%>
							<span style="color:red">用户名重复</span>
						<% }%>
						<% if(a==2){%>
							<span style="color:red">请同意条款</span>
						<% }%>
						<% if(a==3){%>
							<span style="color:red">两次密码不一样</span>
						<% }%>
						<% if(a==4){%>
							<span style="color:red">用户名和密码不能为空</span>
						<% }%>
						</td>
					</tr>
					<tr>
						<td class="td4"><button type="submit">提交</button></td>
						<td>
							<button type="reset">重置</button>
						</td>
					</tr>
				</table>
			</form>
		</div>

	</div>
	<div class="div3"></div>
</body>
</html>