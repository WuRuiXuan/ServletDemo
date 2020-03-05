<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello servlet!
	<br/>
	<a href="login.jsp">登录</a><br/>
	<a href="${pageContext.request.contextPath}/ProductServlet?method=list">商品列表</a><br/>
</body>
</html>