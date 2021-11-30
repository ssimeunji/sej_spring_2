<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>join2</title>
	</head>
	<body>
		<h2>join2.jsp</h2>
		<form action="memberjoin2" method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id"/>
			</div>
			<div>
				<label>비밀번호</label>
				<input type="password" name="password"/>
			</div>
			<div>
				<label>이름</label>
				<input type="text" name="name"/>
			</div>
			<div>
				<label>이메일</label>
				<input type="email" name="email"/>
			</div>
			<div>
				<label>성별</label>
	            <input type="radio" name="gender" value="male" checked>
	            <label>남자</label>
	            <input type="radio" name="gender" value="female">
	            <label>여자</label>
			</div>
			<input type="submit" value="가입하기">
		</form>
	</body>
</html>