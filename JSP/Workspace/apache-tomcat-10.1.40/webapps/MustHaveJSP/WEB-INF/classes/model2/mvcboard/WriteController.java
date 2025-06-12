package model2.mvcboard;

import java.io.IOException;

import fileupload.fileUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.JSFunction;

@WebServlet("/mvcboard/write.do")
@MultipartConfig(
		maxFileSize = 1024*1024*1,
		maxRequestSize=1024*1024*1
)
public class WriteController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 화면에 출력할 데이터가 없으므로 바로 forward 실행해 JSP파일 실행
		req.getRequestDispatcher("/14MVCBoard/Write.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String saveDirectory = req.getServletContext().getRealPath("/Uploads");
		
		String originalFileName = "";
		try {
			originalFileName = fileUtil.uploadFile(req, saveDirectory);
		} catch (Exception e) {
			JSFunction.alertLocation(resp, "파일 업로드에 실패했습니다.", "../mvcboard/write.do");
			return;
		}
		
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(req.getParameter("name"));
		dto.setTitle(req.getParameter("title"));
		dto.setContent(req.getParameter("content"));
		dto.setPass(req.getParameter("pass"));
		
		if (originalFileName != "") {
			String savedFileName = fileUtil.renameFile(saveDirectory, originalFileName);
			dto.setOfile(originalFileName);
			dto.setSfile(savedFileName);
		}
		
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.insertWrite(dto);
		dao.close();
		
		if (result == 1) {
			resp.sendRedirect("../mvcboard/list.do");
		} else {
			JSFunction.alertLocation(resp, "글쓰기에 실패했습니다.", "../mvcboard/write.do");
		}
	}

}
