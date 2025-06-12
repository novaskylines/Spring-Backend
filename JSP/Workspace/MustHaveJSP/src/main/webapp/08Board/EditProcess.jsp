<%@page import="utils.JSFunction"%>
<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// Form태그의 데이터 전달
String num = request.getParameter("num");
String title = request.getParameter("title");
String content = request.getParameter("content");
// DTO에 데이터 저장
BoardDTO dto = new BoardDTO();
dto.setNum(Integer.parseInt(num));
dto.setTitle(title);
dto.setContent(content);
// SQL에 쿼리 전달
BoardDAO dao = new BoardDAO();
int result = dao.updateEdit(dto);
dao.close();
// 성공 여부에 따라 다르게 처리
if (result == 1) {
	response.sendRedirect("View.jsp?num="+dto.getNum());
} else {
	JSFunction.alertBack("수정하기에 실패했습니다.", out);
}
%>