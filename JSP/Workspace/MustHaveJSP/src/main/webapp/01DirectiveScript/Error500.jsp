<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!-- errorPage속성을 설정한 페이지는 에러 발생시 이동 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 지시어 - errorPage, isErrorPage</title>
</head>
<body>
	<%
		// 에러 시 JSP에서 지원되는 에러 페이지가 출력되며, 에러의 내용 및 원인을 모두 출력한다.
		// 출력하지 않으려면 try/catch문 혹은 errorPage 설정을 해야한다.
		// 이 페이지는 try/catch문을 이용한 방법을 사용
		try {
			int myAge = Integer.parseInt(request.getParameter("age"))+10;
			out.println("10년 후 당신의 나이는 "+myAge+"입니다.");
		} catch (Exception e) {
			out.println("요청하신 페이지를 찾을 수 없습니다.");
		}
		// Error 500: age의 값이 주어지지 않았을 경우 parseInt가 실패하면서 500이 반환됨, 개발에 중요한 기능
		// 다만 코드가 보일 경우 보안에 좋지 못하기 때문에 예외 처리를 통해 코드를 숨겨야 한다
	%>

</body>
</html>