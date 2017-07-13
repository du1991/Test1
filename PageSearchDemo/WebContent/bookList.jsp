<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.j1702.model.BookBean"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>显示图书列表</title>
<style type="text/css">
td,th {
	padding: 5px;
	background-color: #FFFFFF;
}
.div1{
	width:98%;
	text-align: center;
}
.div2{
	width:98%;
	text-align: center;
	padding:10px 0 0 0 ;
}
table{
	width:98%;
	border:0;
	text-align: center;
	background-color: #666666;
	
}
</style>
</head>
<body>
	<div class="div1">
		<h2>分页显示图书列表</h2>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>图书名称</th>
			<th>价格</th>
			<th>数量</th>
			<th>作者</th>
		</tr>
		<%
			// 获取图书信息集合
			
			List<BookBean> list = (List<BookBean>)request.getAttribute("list");
			// 判断集合是否有效
			if (list == null || list.size() < 1) {
				out.print("<tr><td colspan='5'>没有任何图书信息！</td></tr>");
			} else {
				// 遍历图书集合中的数据
				for (BookBean book : list) {
		%>
		<tr align="center">
			<td><%=book.getId()%></td>
			<td><%=book.getName()%></td>
			<td><%=book.getPrice()%></td>
			<td><%=book.getBookCount()%></td>
			<td><%=book.getAuthor()%></td>
		</tr>
		<%
			}
		}
		%>
	</table>
	<div class="div2">
		<%=request.getAttribute("bar")%>
	</div>	
</body>
</html>