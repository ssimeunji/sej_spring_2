<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
<style>

</style>
<script type="text/javascript">
	// 비밀번호 입력창에서 비밀번호를 입력받고 DB에서 가져온 비밀번호와 비교해서 일치하면 update처리
	// 일치하지않으면 '비밀번호가 일치하지 않습니다.' alert 출력
	function update() {
		const pw = document.getElementById("m_password").value;
		console.log(pw);
		const pwLength = pw.Length;
		const pwDB = '${member.m_password}';
		console.log(pwDB);
		
		if(pw==pwDB){
			// 이 문장이 아래 form을 전송하는 문장
			update_form.submit();
		} else {
			alert('비밀번호가 일치하지 않습니다.');
		}

	}
</script>
</head>
<body>
	<div class="m-3">
		<h2>update.jsp</h2>
		<form action="update" method="post" name="update_form">
			<div>
				<label>번호: </label>
				<input type="text" name="m_number" value="${member.m_number}" readonly>
			</div>
			<div>
				<label>아이디: </label>
				<input type="text" name="m_id" value="${member.m_id}" readonly>
			</div>
			<div>
				<label>비밀번호: </label>
				<input type="password" name="m_password" id="m_password">
			</div>
			<div>
				<label>이름: </label>
				<input type="text" name="m_name" value="${member.m_name}" readonly>
			</div>
			<div>
				<label class="">이메일: </label>
				<input type="text" name="m_email" value="${member.m_email}">
			</div>
			<div>
				<label class="">전화번호: </label>
				<input type="text" name="m_phone" value="${member.m_phone}">
			</div>
			<div>
				<input type="button" value="수정하기" onclick="update()">
			</div>
			<a href="findAll">목록으로 돌아가기</a>
		</form>
	</div>
</body>
</html>