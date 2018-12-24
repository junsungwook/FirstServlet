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
<%
String[] movieList = {"영화1","영화2","영화3","영화4","영화5"};
pageContext.setAttribute("movieList", movieList);
%>

<table border="1" class="table">
	<tr>
		<th>index</th>
		<th>count</th>
		<th>title</th>
	</tr>
	<c:forEach items="${movieList }" var="movie" varStatus="status">
	<tr>
		<td>${status.index }</td>
		<td>${status.count }</td>
		<td>${movie}</td>
		<td>
			<c:if test="${status.first==true }">첫번째</c:if>
			<c:if test="${status.last==true }">마지막</c:if>
		</td>
		<td>
			<c:if test="${status.index==0 }">첫번째</c:if>
			<c:if test="${status.index==4 }">마지막</c:if>
		</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>