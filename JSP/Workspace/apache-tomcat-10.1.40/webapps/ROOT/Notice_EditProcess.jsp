<%@page import="utils.JSFunction"%>
<%@page import="board.dao.BoardDAO"%>
<%@page import="board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String title = request.getParameter("title");
String content = request.getParameter("content");
BoardDTO dto = new BoardDTO();
dto.setNum(Integer.parseInt(num));
dto.setTitle(title);
dto.setContent(content);
BoardDAO dao = new BoardDAO();
int result = dao.updateBoard(dto);
dao.close();
if (result == 1) {
	response.sendRedirect("Notice_View.jsp?num="+dto.getNum());
} else {
	JSFunction.alertBack("수정하기에 실패했습니다.", out);
}
%>