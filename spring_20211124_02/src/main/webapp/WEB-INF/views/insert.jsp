<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
	<h2>insert.jsp</h2>
	<form action="insert" method="post">
			<div>
				<label>이름</label>
				<input type="text" name="t_name"/>
			</div>
			<div>
				<label>나이</label>
				<input type="text" name="t_age"/>
			</div>
			<div>
				<label>전화번호</label>
				<input type="text" name="t_phone"/>
			</div>
			<div>
				<label>성별</label>
	            <input type="radio" name="t_gender" value="male" checked>
	            <label>남자</label>
	            <input type="radio" name="t_gender" value="female">
	            <label>여자</label>
			</div>
			<div>
				<label>생년월일</label>
				<input type="date" name="t_birth"/>
			</div>
			<div>
				<label>집주소</label>
				<input type="text" name="t_address"/>
			</div>
			<input type="submit" value="등록하기">
		</form>
</body>
</html>