<%@page import="com.j1702.model.Users"%>
<%@page import="com.j1702.model.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<% Goods gd=(Goods)request.getAttribute("detailGood");
%>
<title><%= gd.getName() %>的详情</title>
<style>
        html,body{height: 100%;margin: 0}
        .div1{height:10%;}
        .div1_1{height: 100%;width:10%;background-image: url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);background-position: center;background-size: cover;float: left}
        .div1_2{height: 100%;width: 70%;margin-left: 10%;background-color:antiquewhite;}
        .div2{height: 75%;background-color: azure;width: 70%;margin-left: 10%;}
        .d2_1{width: 50%;height: 100%;float: left}
        .d2_1_1{background-image: url(<%= gd.getPicture()%>);background-size:cover;height: 90%;}
        .d2_1_2{height:10%;background-color: burlywood}
        .d2_2{height: 100%;width:50%;float: left}
        .div3{height:14%;width: 70%; border: solid 1px;margin-left: 10%}
        .ta1{height:50%;margin-left: 10%;margin-top: 20%}
        .td{text-decoration: line-through}
        .f1{height:100%}
        td{font-size: 25px}
        button{width:100px;height: 40px;font-size: 15px }
        .input{width:70px}
        a{text-decoration: none}
    </style>
    <script type="text/javascript">
    		function tell(){
    			alert("请先登录！");
    			
    		}
    </script>
</head>
<body>
<div class="div1">
        <div class="div1_1"></div>
        <div class="div1_2"> </div>
    </div>
    <div class="div2" >
        <div class="d2_1">
            <div class="d2_1_1"></div>
            <div class="d2_1_2"></div>
        </div>
        <div class="d2_2">
             
            <form action="CartServlet" class="f1">
                <table class="ta1">
                <tr><td > <%= gd.getName() %></td><td colspan="5"><%= gd.getGoodexplain() %></td></tr>
                <tr><td>价格<input type="hidden" name="GoodsIdDetail" value="<%= gd.getId() %>"/></td><td class="td">￥<%= gd.getPrice() %></td></tr>
                <tr><td>淘宝价</td><td>￥<%= gd.getLowprice() %></td><td><%= gd.getLowpriceexplain() %></td></tr>
                <tr><td>数量</td><td><input type="text" class="input" name="buynum"></td><td>库存(<%= gd.getNum() %>)</td></tr>
              
              <% Users u=(Users)session.getAttribute("ss"); 
			if(u!=null){%>
 				<tr><td><button type="submit">加入购物车</button></td></tr>
		<% 	}
		else{%> 	
                <tr><td><button onclick="tell()"><a href="Login.jsp">加入购物车</a></button></td></tr>
               <% }%>
                </table>
            </form>
            
        </div>
    </div>
    <div class="div3">
    </div>

</body>
</html>