<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<style>
	input {
		display: block;
	}
</style>
</head>
<body>
	<h2>login.jsp</h2>
	<!-- 로그인 처리 후 성공하면 main.jsp 출력 실패하면 login.jsp 출력 -->
	<form action="login" method="post">
		<div>
			<label>아이디: </label><input type="text" name="m_id">
		</div>
		<div>
			<label>비밀번호: </label><input type="password" name="m_password">
		</div>
		<div>
			<input type="submit" value="로그인">
		</div>
	</form>
</body>
</html>