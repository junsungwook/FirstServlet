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
<div class="container">
		<div align="center" id="count">
			총 게시물 수 : ${count }
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>이름</th>
					<th>주소</th>
					<th>전화번호</th>
				</tr>
			</thead>
			<tbody id="result">
				<c:forEach items="${ad}" var="list">
					<tr>	
						<td><a href="view.do?num=${list.num}">${list.name }</a></td>
						<td>${list.addr }</td>
						<td>${list.tel }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<select id="what">
		    <option value="name">이름</option>
		    <option value="addr">주소</option>
		</select>
		<input type="text" name="search" id="str">
		<input type="button" value="검색" id="searchBtn">
	</div>	
	
</body>
</html>