<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DETAIL</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
	<div class="m-3">
		<h2>detail.jsp</h2>
		<table class="table text-center">
			<tr>
				<th>번호</th>
				<th>아이디</th>
	 			<th>비밀번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>전화번호</th>
			</tr>
			<tr>
				<td>${member.m_number}</td>
				<td>${member.m_id}</td>
				<td>${member.m_password}</td>
				<td>${member.m_name}</td>
				<td>${member.m_email}</td>
				<td>${member.m_phone}</td>
			</tr>
		</table>
		<a href="findAll">목록으로 돌아가기</a>
		
		<a href="/">홈(/)</a> <!-- http://localhost:8081/ 최상위로 올라감-->
		<a href="./">홈(./)</a><!-- http://localhost:8081/member 한 수준 위로 올라감 -->
		<a href="../">홈(../)</a><!-- http://localhost:8081/ 상위 수준으로 올라감-->
	</div>
</body>
</html>