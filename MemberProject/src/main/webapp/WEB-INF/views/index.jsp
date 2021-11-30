<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>index</title>
</head>
<body>
	<h2>index.jsp</h2>
	<a href="save">회원가입</a>
	<a href="login">로그인</a>
	
	세션값: ${sessionScope.loginId}
</body>
</html>
