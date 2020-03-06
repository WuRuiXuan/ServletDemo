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
<% List<Product> list = (List<Product>) request.getAttribute("products"); %>
</head>
<body>
	<h2 align="center">商品列表</h2>
	<table align="center" border="1">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>单价</th>
			<th>数量</th>
			<th>描述</th>
			<th>功能</th>
		</tr>
		<% for (Product p : list) { %>
			<tr>
				<td><%= p.getPid() %></td>
				<td><%= p.getName() %></td>
				<td><%= p.getPrice() %></td>
				<td><%= p.getNums() %></td>
				<td><%= p.getDescription() %></td>
				<td>
					<input type="button" value="修改" onclick="location.href='${pageContext.request.contextPath}/ProductServlet?method=find&pid=<%= p.getPid() %>'"/>
					<input type="button" value="删除" onclick="location.href='${pageContext.request.contextPath}/ProductServlet?method=delete&pid=<%= p.getPid() %>'"/>
				</td>
			</tr>
		<% } %>
		<tr>
			<td colspan="6" align="center">
				<input type="button" value="添加商品" onclick="location.href='${pageContext.request.contextPath}/add.jsp'"/>
			</td>
		</tr>
	</table>
</body>
</html>