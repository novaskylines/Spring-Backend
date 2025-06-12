package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/12Servlet/HelloServlet.do")
public class HelloServlet extends HttpServlet {
	// 서블릿 버전관리용 식별자, 작성하지 않으면 경고 발생, 오류가 생기지는 않음
	// 자동완성 추천
	private static final long serialVersionUID = 1L;
	
	// Get 방식으로 전달된 요청을 처리하는 메서드, 화면 출력
	// doGet 후 ctrl space 누르고 자동완성
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("message", "Hello Servlet..!!");
		req.getRequestDispatcher("/12Servlet/HelloServlet.jsp").forward(req, resp);
	}
	// Post 방식으로 전달된 요청을 처리하는 메서드, 메서드, 추가, 수정, 삭제 용도
	// Get과 Post 둘 다 만들어야만 작동, 하나라도 없으면 작동 X
	// doPost 후 ctrl space 누르고 자동완성
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
