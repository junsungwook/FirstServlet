<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>이름</th>
				<th>주소</th>
				<th>전화번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ad}" var="list">
				<tr>	
					<td>${list.name }</td>
					<td>${list.addr }</td>
					<td>${list.tel }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>