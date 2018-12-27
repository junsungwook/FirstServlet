<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<script>
function zipfinder(){
	window.open("zip.do","","width=700 height=400");
}
</script>
<body>
<div class="col-xs-7">
	<a href="list.do">전체보기</a><br>
	주소록 등록하기
	<form action="insert.do" method="post" name="frm">
		<table class='table table-striped'>
			<tr>
				<td>이름 : </td>
				<td colspan="2"><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>우편번호 : </td>
				<td><input type="text" name=zipcode id="zipcode"></td>
				<td><input type="button" class="btn btn-default" value="검색" onclick="zipfinder()" value="찾기"></td>
			</tr>
			<tr>
				<td>주소 : </td>
				<td colspan="2"><input type="text" name="addr" id="addr" size="40"></td>
			</tr>
			<tr>
				<td>전화번호 : </td>
				<td colspan="2"><input type="text" name="tel" id="tel"></td>
			</tr>
		</table>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</div>
</body>
</html>