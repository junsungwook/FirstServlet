<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<h1>당신이 좋아하는 강아지를 선택하세요</h1>
<form action="dogAction" method="get">
	<input type="checkbox" name="dog" value="푸들">푸들
	<input type="checkbox" name="dog" value="진돗개">진돗개
	<input type="checkbox" name="dog" value="풍산개">풍산개
	<input type="checkbox" name="dog" value="삽살개">삽살개
	<input type="submit" value="선택">
</form>
<body>
</html>