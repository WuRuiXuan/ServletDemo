<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- pageContext.request.contextPath: http://localhost:8080/ServletDemo -->
	<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="password"/><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>