package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.dao.MemberDAO;

@WebServlet("/join.do")
public class JoinController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("email_1");
		String email = req.getParameter("email_1")+"@"+req.getParameter("email_2");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		int agree = req.getParameter("agree")==null?0:1;
		String content = req.getParameter("content");

		MemberDAO dao = new MemberDAO();
		dao.addMember(id, email, name, password, phone, gender, agree, content);
		resp.sendRedirect("Index.jsp");
	}
}
