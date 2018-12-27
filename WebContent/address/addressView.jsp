<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script  src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
$(document).ready(function(){
	$("#del").click(function(){
		if(confirm("정말 삭제할까요?")){ 
			location.href="delete.do?num=${ad.num }";
	    }else{
			return false;
		}
	});
})
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<div class="container">
	<form action="update.do">
		<input type="hidden" name="num" value="${ad.num }">
		<table class="table table-striped">
			<tr>
				<td>이름</td>
				<td><input type="text" class="form-control" name="name" value="${ad.name }">
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" id="addr" class="form-control" value="${ad.addr }">
				<td><input type="button" value="검색" onclick="window.open('zip.do')"></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" name="zipcode" id="zipcode" class="form-control" value="${ad.zipcode }">
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" class="form-control" value="${ad.tel }">
			</tr>
		</table>
		<input type="submit" value="수정">
		<input type="button" value="삭제" id="del">
	</form>
	
</div>
</body>
</html>