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

@WebServlet("/notice_delete.do")
public class RemoveController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		
		BoardDTO dto = new BoardDTO();
		BoardDAO dao = new BoardDAO();
		dto = dao.readBoard(num);

		String sessionId = req.getSession().getAttribute("UserId").toString();

		int delResult = 0;

		if (sessionId.equals(dto.getId())) {
			dto.setNum(num);
			delResult = dao.deleteBoard(num);
			dao.close();
			
			if (delResult == 1) {
				JSFunction.alertLocation(resp, "삭제되었습니다.", "./notice_list.do");
			} else {
				JSFunction.alertBack(resp, "삭제에 실패하였습니다.");
			}
		} else {
			JSFunction.alertBack(resp, "본인만 삭제할 수 있습니다.");
			
			return;
		}
	}	
	

}
