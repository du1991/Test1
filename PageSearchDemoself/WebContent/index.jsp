

<%@page import="com.j1702.model.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
header{text-align:center;}
table,td{border:solid;}
td{text-align:center;width:200px;height:50px}
a{font-size:36px}

</style>
</head>
<body>

<%! int nowpage;%>
<% Object ss= request.getAttribute("nowpage");
if(ss==null){ %>
<header ><h1>分页显示图书列表</h1></header>
	<table cellspacing=0 cellpadding=0 align=center>
	<tr> <td> ID</td > <td> 图书名称</td><td> 价格</td><td> 数量</td><td> 作者</td></tr>
	<tr> <td> 1</td > <td> 语文</td><td> 11.0</td><td> 11</td><td> 王大宝</td></tr>
	<tr> <td> 2</td > <td> 数学</td><td> 18.0</td><td> 12</td><td> 马云</td></tr></table>
	
	<div align=center>
	<a href="FindServlet?nowpage=1">1</a>
	<a href="FindServlet?nowpage=2">2</a>
	<a href="FindServlet?nowpage=3">3</a>
	<a href="FindServlet?nowpage=4">4</a>
	</div>

<% }else{
%>
	<header ><h1>分页显示图书列表</h1></header>
	<table cellspacing=0 cellpadding=0 align=center>
	<tr> <td> ID</td > <td> 图书名称</td><td> 价格</td><td> 数量</td><td> 作者</td></tr>
 	<% List<Book> li= (List<Book>)request.getAttribute("BookData"); %>
 	<% for(Book bo:li){
 	 %>
	<tr> <td> <%= bo.getId() %></td> <td ><%= bo.getName()%></td><td> <%= bo.getPrice()%></td><td> <%= bo.getBookCount()%></td><td> <%= bo.getAuthor()%></td></tr>
	<% }
 	%>
	</table>
	<div align=center>
	<a href="FindServlet?nowpage=1">1</a>
	<a href="FindServlet?nowpage=2">2</a>
	<a href="FindServlet?nowpage=3">3</a>
	<a href="FindServlet?nowpage=4">4</a>
	</div>
<% }%>
	
</body>
</html>