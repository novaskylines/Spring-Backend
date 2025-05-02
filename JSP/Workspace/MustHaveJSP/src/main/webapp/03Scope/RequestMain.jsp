<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "common.Person" %>
<%
	request.setAttribute("requestString", "request 영역의 문자열"); 
	request.setAttribute("requestPerson", new Person("안중근", 31));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 메인</title>
</head>
<body>
	<h2>request 영역의 속성값 삭제하기</h2>
	<%
		// request에 저장된 속성 삭제, 속성이 없어도 에러가 나지 않는다.
		request.removeAttribute("requestString");
		request.removeAttribute("requestInteger");
	%>
	<h2>request 영역의 속성값 읽기</h2>
	<%
		Person rPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	<ul>
		<li>String객체 : <%=request.getAttribute("requestString") %></li>
		<li>Person객체 : <%=rPerson.getName() %>, <%=rPerson.getAge() %></li>
	</ul>
	<%
		// foward의 경우 request의 데이터와 parameter 데이터 전달 가능
		// sendRedirect의 경우 parameter 데이터만 전달 가능
		request
		 	.getRequestDispatcher("RequestForward.jsp?han=한글&eng=영어")
		 	.forward(request, response); 
		//response.sendRedirect("RequestFoward.jsp?han=한글&eng=영어");
	%>
</body>
</html>