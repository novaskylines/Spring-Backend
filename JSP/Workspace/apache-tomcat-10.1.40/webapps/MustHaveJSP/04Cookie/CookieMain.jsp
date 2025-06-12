<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<body>
	<h2>1. 쿠키(Cookie) 설정</h2>
	<%
		// Cookie 생성자를 이용해 저장할 쿠키를 작성
		Cookie cookie = new Cookie("myCookie", "쿠키맛나요");
		// 쿠키의 경로 설정
		// request.getContextPath() : 도메인 및 포트까지의 경로
		cookie.setPath(request.getContextPath());
		// 쿠키의 유지시간을 초단위로 설정: 계산식을 넣는 것이 이해하기 편함
		cookie.setMaxAge(60*60*24*7);
		// 브라우저에 저장할 수 있도록 response에 쿠키를 담아서 반환
		response.addCookie(cookie);
	%>
	
	<h2>2. 쿠키 설정 직후 쿠키값 확인하기</h2>
	<%
	// request 안의 쿠키를 확인하는 법
	// 쿠키 데이터를 배열에 저장
	Cookie[] cookies = request.getCookies();
	// 최초 접속이라면 null, 두번째 부터는 JSESSIONID가 있기 때문에 null이 아님 
	if (cookies!=null) {
		// foreach
		for (Cookie c: cookies) {
			// key 출력
			String cookieName = c.getName();
			// value 출력
			String cookieValue = c.getValue();
			out.println(String.format("%s : %s<br/>", cookieName, cookieValue));
		}
	}
	%>
	
	<h3>3. 페이지 이동 후 쿠키값 확인하기</h3>
	<a href="CookieResult.jsp">
		다음 페이지에서 쿠키값 확인하기
	</a>
</body>
</html>