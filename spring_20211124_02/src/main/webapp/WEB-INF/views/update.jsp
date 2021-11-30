<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>update.jsp</h2>
	<form action="update" method="post">
		<div>
			<label>번호</label>
			<input type="text" name="t_number" value="${trainee.t_number}" readonly/>
		</div>
		<div>
			<label>이름</label>
			<input type="text" name="t_name" value="${trainee.t_name}" readonly/>
		</div>
		<div>
			<label>나이</label>
			<input type="text" name="t_age" value="${trainee.t_age}" readonly/>
		</div>
		<div>
			<label>전화번호</label>
			<input type="text" name="t_phone" value="${trainee.t_phone}"/>
		</div>
		<%-- <div>
			<select name="t_gender" value="${trainee.t_gender}">
				<option value="male">남</option>
				<option value="female">여</option>
			</select>
			<label>성별</label>
            <input type="radio" name="t_gender" value="male" checked>
            <label>남자</label>
            <input type="radio" name="t_gender" value="female">
            <label>여자</label>
		</div>
		<div>
			<label>생년월일</label>
			<input type="date" name="t_birth" value="${trainee.t_birth}"/>
		</div> --%>
		<div>
			<label>집주소</label>
			<input type="text" name="t_address" value="${trainee.t_address}"/>
		</div>
		<input type="submit" value="수정">
	</form>
</body>
</html>