<%@page import="utils.BoardPage"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 인스턴스 생성
BoardDAO dao = new BoardDAO();
// 검색 설정을 담는 HashMap 생성
Map<String, Object> param = new HashMap<>();
// 어디(제목/내용)를 검색할지 설정하는 searchField 저장
String searchField = request.getParameter("searchField");
// 검색할 내용을 설정하는 searchWord 저장
String searchWord = request.getParameter("searchWord");
// 검색어가 null이 아닐 때만 map에 데이터를 저장
if (searchWord != null) {
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}
// 검색된 데이터의 개수를 저장
int totalCount = dao.selectCount(param);
// 한 페이지에 출력할 데이터
int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
// 페이지 블럭에 표시될 페이지
int blockPage = Integer.parseInt(application.getInitParameter("POSTS_PER_BLOCK"));
// 전체 페이지의 개수
int totalPage = (int)Math.ceil((double)totalCount/pageSize);

// 현재 페이지
int pageNum = 1;
// 클릭한 페이지를 가져옴
String pageTemp = request.getParameter("pageNum");
// 클릭한 페이지가 있으면 현재 페이지를 변경하고 없으면 1페이지 설정
if(pageTemp != null && !pageTemp.equals("")) {
	pageNum = Integer.parseInt(pageTemp);
}

// 목록에 출력할 게시물의 범위 계산
int start = (pageNum - 1) * pageSize + 1;
int end = pageNum * pageSize;
param.put("start", start);
param.put("end", end);

// System.out.println(pageSize + " " + blockPage + " " + pageNum + " " + start + " " + end);

// 검색된 데이터의 리스트를 저장
List<BoardDTO> boardLists = dao.selectListPage(param);
// 데이터베이스와의 접속을 정료
dao.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../common/Link.jsp" />
	<h2>목록 보기(List) - 현재 페이지 : <%= pageNum %> (전체 : <%= totalPage %>)</h2>
	<!-- 검색폼 -->
	<form method="get">
	<table border="1" width="90%">
		<tr>
			<td align="center">
				<select name="searchField">
					<option value="title">제목</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="searchWord" />
				<input type="submit" value="검색하기" />
			</td>
		</tr>
	</table>
	</form>
	<!-- 게시물 목록 테이블(표) -->
	<table border="1" width="90%">
		<!-- 각 칼럼의 제목 -->
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
		<!-- 목록의 내용 -->
		<%
			// 목록이 비어있을 경우
			if (boardLists.isEmpty()) {
		%>
				<tr>
					<td colspan="5" align="center">
						등록된 게시물이 없습니다^^*
					</td>
				</tr>
		<%
			// 목록이 비어있지 않은 경우
			} else {
				int virtualNum = 0;
				int countNum = 0;
				for (BoardDTO dto : boardLists) {
					// virtualNum = totalCount--;
					virtualNum = totalCount - (((pageNum - 1) * pageSize) + countNum++);
		%>
				<tr align="center">
					<td><%= virtualNum%></td>
					<td align="left">
						<a href="View.jsp?num=<%= dto.getNum() %>"><%= dto.getTitle() %></a>
					</td>
					<td align="center"><%= dto.getId() %></td>
					<td align="center"><%= dto.getVisitcount() %></td>
					<td align="center"><%= dto.getPostdate() %></td>
				</tr>
		<%
				}
			}
		%>
	</table>
	<!-- 목록 하단의 글쓰기 버튼 -->
	<table border="1" width="90%">
		<tr align="center">
			<td>
				<%= BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, request.getRequestURI()) %>
			</td>
			<td>
				<button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
			</td>
		</tr>
	</table>
</body>
</html>