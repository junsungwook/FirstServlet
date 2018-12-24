<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<form action="personInfo1" method="post">
	이름 : <input type="text" name="name"><br>
	아이디 : <input type="text" name="id"><br>
	패스워드 : <input type="password" name="password"><br><br>
	성별 : 
		남<input type="radio" name="gender" value="male">
		여<input type="radio" name="gender" value="female"><br><br>
	메일 수신 여부 : 
		공지 메일 <input type="checkbox" name="notice" value="공지">
		광고 메일 <input type="checkbox" name="notice" value="광고">
		배송 확인 메일 <input type="checkbox" name="notice" value="배송"><br><br>
	직업 : 
		<select name="job">
			<option>회사원</option>
			<option>학생</option>
			<option>기타</option>
		</select><br><br>
	<input type="submit" value="확인">
	<input type="reset" value="취소">
</form>
</body>
</html>