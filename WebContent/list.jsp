<%@page import="com.study.demo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 嵌入Java代码 -->
<%
	List<Product> list = (List<Product>) request.getAttribute("products");
%>
</head>
<body>
	<h2>商品列表</h2>
	<table align="center">
		<tr>
			<th>商品编号</th>
			<th>商品名称</th>
			<th>商品单价</th>
			<th>商品数量</th>
			<th>商品描述</th>
		</tr>
		<% for (Product p : list) { %>
			<tr>
				<td><%= p.getPid() %></td>
				<td><%= p.getName() %></td>
				<td><%= p.getPrice() %></td>
				<td><%= p.getNums() %></td>
				<td><%= p.getDescription() %></td>
			</tr>
		<% } %>
	</table>
</body>
</html>