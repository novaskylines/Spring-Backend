<%@page import="board.dao.BoardDAO"%>
<%@page import="board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp" %>
<%
String num = request.getParameter("num");
BoardDTO dto = new BoardDTO();
BoardDAO dao = new BoardDAO();
dto = dao.readBoard(Integer.parseInt(num));

String sessionId = session.getAttribute("UserId").toString();

int delResult = 0;

if (sessionId.equals(dto.getId())) {
	dto.setNum(Integer.parseInt(num));
	delResult = dao.deleteBoard(Integer.parseInt(num));
	dao.close();
	
	if (delResult == 1) {
		JSFunction.alertLocation("삭제되었습니다.", "Notice_List.jsp", out);
	} else {
		JSFunction.alertBack("삭제에 실패하였습니다.", out);
	}
} else {
	JSFunction.alertBack("본인만 삭제할 수 있습니다.", out);
	
	return;
}
%>
