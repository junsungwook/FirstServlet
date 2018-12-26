<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<a>전체보기</a><br>
주소록 등록하기
<form>
<table>
	<tr>
		<td>이름 : </td>
		<td colspan="2"><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>우편번호 : </td>
		<td><input type="text" name="addrnum"></td>
		<td><input type="button" value="검색"></td>
	</tr>
	<tr>
		<td>주소 : </td>
		<td colspan="2"><input type="text" name="addr"></td>
	</tr>
	<tr>
		<td>전화번호 : </td>
		<td colspan="2"><input type="text" name="tel"></td>
	</tr>
</table>
<input type="submit" value="등록">
<input type="reset" value="취소">
</form>
</body>
</html>