<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<c:if test="${id!=null }">
	<b>${id }</b>
</c:if>
<c:if test="${id==null || id==''}">
	<b>Guest</b>
</c:if>

<c:choose>
	<c:when test="${color=='yellow' }">
		<c:set var="c" value="노란색"/>
	</c:when>
	<c:when test="${color=='blue' }">
		<c:set var="c" value="파란색"/>
	</c:when>
	<c:when test="${color=='orange' }">
		<c:set var="c" value="오렌지색"/>
	</c:when>
	<c:when test="${color=='pink' }">
		<c:set var="c" value="핑크"/>
	</c:when>
	<c:otherwise>
		<c:set var="c" value="블랙"></c:set>
	</c:otherwise>
</c:choose>
님이 좋아하는 색깔은 <font color="${color}">${c }</font>  입니다
</body>
</html>