<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="utils.CookieManager"
    import="utils.JSFunction"%>
<%
// 로그인 버튼 실행 시 실행되는 코드
String user_id = request.getParameter("user_id");
String user_pw = request.getParameter("user_pw");
String save_check = request.getParameter("save_check");

// id와 pw가 일치할 경우 로그인 처리를 시행
if ("must".equals(user_id) && "1234".equals(user_pw)) {
	if (save_check != null && save_check.equals("Y")) {
		// 체크박스의 값이 null이 아니고 체크되어있을 경우 쿠키에 저장
		CookieManager.makeCookie(response, "loginId", user_id, 86400);
	} else {
		// 체크되어있지 않을 경우 쿠키 제거
		CookieManager.deleteCookie(response, "loginId");
	}
	
	JSFunction.alertLocation("로그인에 성공했습니다.", "IdSaveMain.jsp", out);
} else {
	JSFunction.alertBack("로그인에 실패했습니다.", out);
}
%>