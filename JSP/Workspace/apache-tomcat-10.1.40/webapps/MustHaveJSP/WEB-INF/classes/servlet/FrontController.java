package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// *.one으로 .one의 모든 서블릿을 불러오나, 따로 불러오고 싶으면 파일을 별개로 만드는걸 추천
@WebServlet("*.one")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		int lastSlash = uri.lastIndexOf("/");
		String commandStr = uri.substring(lastSlash);
		
		if (commandStr.equals("/regist.one")) {
			registFunc(req);
		} else if (commandStr.equals("/login.one")) {
			loginFunc(req);
		} else if (commandStr.equals("/freeboard.one")) {
			freeboardFunc(req);
		}  
		req.setAttribute("uri", uri);
		req.setAttribute("commandStr", commandStr);
		req.getRequestDispatcher("/12Servlet/FrontController.jsp").forward(req,resp);
	}

	void freeboardFunc(HttpServletRequest req) {
		req.setAttribute("resultValue",  "<h4>회원가입</h4>");
	}

	void loginFunc(HttpServletRequest req) {
		req.setAttribute("resultValue",  "<h4>로그인</h4>");
	}

	void registFunc(HttpServletRequest req) {
		req.setAttribute("resultValue",  "<h4>자유게시판</h4>");
	}
}
