package program.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import program.dao.ProgramDAO;
import program.dto.ProgramDTO;

@WebServlet("/program_view.do")
public class ViewController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProgramDAO dao = new ProgramDAO();
		
		List<ProgramDTO> programList = dao.readPrograms();
		
		dao.close();
		
		req.setAttribute("programList", programList);
		req.getRequestDispatcher("Program_View.jsp").forward(req, resp);
	}
	

}
