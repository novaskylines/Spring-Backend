package model2.mvcboard;

import java.io.IOException;

import fileupload.fileUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utils.JSFunction;

@WebServlet("/mvcboard/edit.do")
@MultipartConfig(
		maxFileSize = 1024 * 1024 * 1,
		maxRequestSize = 1024 * 1024 * 10
)
public class EditController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idx = req.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = dao.selectView(Integer.parseInt(idx));
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("/14MVCBoard/Edit.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String saveDirectory = req.getServletContext().getRealPath("/Uploads");
		
		String originalFileName = "";
		try {
			originalFileName = fileUtil.uploadFile(req, saveDirectory);
		} catch (Exception e) {
			JSFunction.alertBack(resp, "파일 업로드에 실패했습니다.");
			return;
		}
		
		String idx = req.getParameter("idx");
		String prevOfile = req.getParameter("prevOfile");
		String prevSfile = req.getParameter("prevSfile");
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		HttpSession session = req.getSession();
		String pass = (String)session.getAttribute("pass");
		
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setIdx(Integer.parseInt(idx));
		dto.setName(name);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setPass(pass);
		
		if (originalFileName != "") {
			String savedFileName = fileUtil.renameFile(saveDirectory, originalFileName);
			dto.setOfile(originalFileName);
			dto.setSfile(savedFileName);
		} else {
			dto.setOfile(prevOfile);
			dto.setSfile(prevSfile);
		}
		
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.updatePost(dto);
		dao.close();
		
		if (result == 1) {
			session.removeAttribute("pass");
			resp.sendRedirect("../mvcboard/view.do?idx="+idx);
		} else {
			JSFunction.alertLocation(resp, "비밀번호 검증을 다시 진행해주세요.", "../mvcboard/view.do?idx="+idx);
		}
	}

}
