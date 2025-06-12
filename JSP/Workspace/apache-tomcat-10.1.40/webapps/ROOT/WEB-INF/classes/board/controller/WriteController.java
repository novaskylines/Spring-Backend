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

@WebServlet("/notice_write.do")
public class WriteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Notice_Write.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// title과 content를  변수에 저장
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		// dto 생성
		BoardDTO dto = new BoardDTO();
		// title, content, id  데이터를 설정
		dto.setTitle(title);
		dto.setContent(content);
		dto.setId(req.getSession().getAttribute("UserId").toString());

		BoardDAO dao = new BoardDAO();
		int iResult = dao.createBoard(dto);
		dao.close();

		// iResult가1이면 정상적으로 데이터가 저장됨
		// 다른 숫자가 나오면 비정상으로 데이터가 저장되지않음을 의미
		if(iResult == 1){
			resp.sendRedirect("./notice_list.do");
		}else{
			JSFunction.alertLocation(resp, "글쓰기에 실패했습니다.", "../mvcboard/write.do");
		}
	}


}
