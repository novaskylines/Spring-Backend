package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("pw");

		if (id=="") {
			// 아이디 입력 필요
			req.setAttribute("LoginErrMsg", "아이디를 입력하세요.");
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		} else if (password=="") {
			// 비밀번호 입력 필요
			req.setAttribute("LoginErrMsg", "비밀번호를 입력하세요.");
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		} else {
			MemberDAO dao = new MemberDAO();
			MemberDTO dto = dao.getMember(id, password);
			if (dto==null) {
				// 로그인 실패
				req.setAttribute("LoginErrMsg", "아이디 또는 비밀번호가 일치하지 않습니다.");
				req.getRequestDispatcher("Login.jsp").forward(req, resp);
			} else {
				// 로그인 성공
				HttpSession session = req.getSession();
				session.setAttribute("UserId", dto.getId());
				session.setAttribute("UserName", dto.getName());
				session.setAttribute("UserDTO", dto);
				resp.sendRedirect("Index.jsp");
			}
		}
	}

}
