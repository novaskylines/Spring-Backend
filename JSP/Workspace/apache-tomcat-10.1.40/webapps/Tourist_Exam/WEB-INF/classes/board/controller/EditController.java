package board.controller;

import java.io.IOException;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.JSFunction;

@WebServlet("/notice_edit.do")
public class EditController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.readBoard(num);
		
		req.setAttribute("dto", dto);
		req.setAttribute("userId", req.getSession().getAttribute("UserId"));
		req.getRequestDispatcher("/Notice_Edit.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num = req.getParameter("num");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardDTO dto = new BoardDTO();
		dto.setNum(Integer.parseInt(num));
		dto.setTitle(title);
		dto.setContent(content);
		BoardDAO dao = new BoardDAO();
		int result = dao.updateBoard(dto);
		dao.close();
		if (result == 1) {
			resp.sendRedirect("./notice_view.do?num="+dto.getNum());
		} else {
			JSFunction.alertBack(resp, "수정하기에 실패했습니다.");
		}
	}

}
