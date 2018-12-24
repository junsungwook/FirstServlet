<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL core 라리으버리 사용 예제</title>
</head>
<body>
<c:set var="test" value="Hello JSTL"/>
<h3>&lt;c:set&gt; 사용 후 : <c:out value="${test }"/></h3>
<c:remove var="test"/>
<h3>&lt;c:remove&gt; 사용 후 : <c:out value="${test }"/></h3>

<c:catch var="err">
	<%=10/0 %>
</c:catch>
<h3>&lt;c:catch&gt; 사용 후 : <c:out value="${err }"/></h3>

<c:if test="${5<10 }">
	<h3>5는 10보다 작다</h3>
</c:if>
<c:if test="${6+3==9 }">
	<h3>6+3은 9이다</h3>
</c:if>

<c:choose>
	<c:when test="${5+10==50 }">
		<h3>5+10 은 50이다</h3>
	</c:when>
	<c:otherwise>
		<h3>5+10은 50이 아니다</h3>
	</c:otherwise>
</c:choose>
</body>
</html>