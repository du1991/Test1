<%@page import="com.j1702.model.Carts"%>
<%@page import="java.util.List"%>
<%@page import="com.j1702.model.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>购物车页面</title>
    <style>
        html,body{height: 100%;margin: 0}
        .div1{height:10%;}
        .div1_1{height: 100%;width:10%;background-image: url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);background-position: center;background-size: cover;float: left}
        .div1_2{height: 100%;width: 70%;margin-left: 10%;background-color:antiquewhite;}
        .div2{height: 75%;background-color: azure;width: 70%;margin-left: 10%;}
        .div3{height:14%;width: 70%; border: solid 1px;margin-left: 10%}
        .input{width: 40px;height:40px;margin-top: 0px;}
        td{width: 200px;text-align: center;font-size: 25px}
        button{width: 90px;height: 50px;font-size: 25px;margin-left: 50%}
      .td{}
    </style>
    <script>
    function tell(){
    	alert("该功能开发者未完善！尽情期待...")
    }</script>	
</head>
<body>

	<% 
		List<Carts> ca=(List<Carts>)request.getAttribute("cartgoods");
	%>
    <div class="div1">
        <div class="div1_1"></div>
        <div class="div1_2"> </div>
    </div>
    <div class="div2" >
        <form action="">
            <table>
                <tr>
                   <td><input type="checkbox" class="input">全选</td>
                   <td>商品简图</td>
                   <td>单价</td>
                   <td>数量</td>
                   <td>金额</td>
                   <td>操作时间</td>
                </tr>
                <%  if(ca!=null){for(Carts caa:ca){%>    
                <tr >
                <td><input type="checkbox" class="input"></td>
                <td class="td" style="background-image:url(<%= caa.getPicture()%>);background-size:contain"></td>
               <td><%= caa.getLowprice()%></td>
               <td><%= caa.getBuynum() %></td>	
               <td><%= caa.getTotalmoney()%></td>
               <td style="font-size:18px"><%= caa.getTime()%></td>
                </tr>
                  <% }}else{%>
                	  <tr><td colspan="5"> 您的购物车还没有商品</td></tr>	
                	  
                	  
                  <% }%>
                <tr>
                    <td colspan="5"><button type="button" onclick="tell()">结账</button></td>
                </tr>
            </table>
        </form>
    </div>
    <div class="div3">
    </div>
</body>
</html>