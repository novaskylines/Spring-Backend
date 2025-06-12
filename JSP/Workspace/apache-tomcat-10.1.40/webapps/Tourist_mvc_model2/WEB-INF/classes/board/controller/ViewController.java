package board.controller;

import java.io.IOException;
import java.util.List;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notice_view.do")
public class ViewController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.readBoard(num);
		
		String newContent = dto.getContent().replace("\r\n", "<br/>");
		dto.setContent(newContent);
		
		List<Integer> numList = dao.viewNumList();
//		System.out.println(numList.toString());
		int numListIdx = numList.indexOf(num);
		if (numListIdx > 0) {
			int prevNum = numList.get(numListIdx-1);
			BoardDTO prevDto = dao.readBoard(prevNum);
			req.setAttribute("prevDto", prevDto);
		}
		if (numListIdx < numList.size()-1 ) {
			int nextNum = numList.get(numListIdx+1);
			BoardDTO nextDto = dao.readBoard(nextNum);
			req.setAttribute("nextDto", nextDto);
		}
		
		req.setAttribute("dto", dto);
		req.setAttribute("userId", req.getSession().getAttribute("UserId"));
		req.getRequestDispatcher("/Notice_View.jsp").forward(req, resp);
	}

}
