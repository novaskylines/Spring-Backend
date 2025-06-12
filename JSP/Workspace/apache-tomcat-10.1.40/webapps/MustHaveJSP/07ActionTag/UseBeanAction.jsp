<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 - UseBeanAction</title>
</head>
<body>
	<h3>액션 태그로 폼값 한번에 받기</h3>
	<jsp:useBean id="person" class="common.Person" />
	<jsp:setProperty property="*" name="person"/>
	<!-- getParameter를 사용할 필요 없이 property를 *로 한번에 설정 가능 -->
	<!-- * : 폼태그의 name과 Person의 변수명이 같으면 자동으로 채움 -->
	<ul>
		<li>이름 : <jsp:getProperty name="person" property="name"/></li>
		<li>나이 : <jsp:getProperty name="person" property="age"/></li>
	</ul>
</body>
</html>




