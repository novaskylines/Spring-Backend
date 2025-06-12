package program.controller;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/program_cookie.do")
public class CookieController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Cookie 생성자를 이용해 저장할 쿠키를 작성
		Cookie cookie = new Cookie(URLEncoder.encode(req.getParameter("cookieName"), "UTF-8"), URLEncoder.encode(req.getParameter("cookieName"), "UTF-8"));
		// 쿠키의 경로 설정
		// request.getContextPath() : 도메인 및 포트까지의 경로
		cookie.setPath(req.getContextPath());
		// 쿠키의 유지시간을 초단위로 설정: 계산식을 넣는 것이 이해하기 편함
		cookie.setMaxAge(60*60*24*7);
		resp.addCookie(cookie);
		req.getRequestDispatcher("./program_view.do").forward(req, resp);
	}

}
