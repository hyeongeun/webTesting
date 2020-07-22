package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example09_CookieSet
 */
public class Example09_CookieSet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Example09_CookieSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String[] kakao = request.getParameterValues("kakao");
		System.out.println(kakao.length);

		//sessionScope : context(프로젝트 : webTesting) 안에 모든 page에서 공유
		//request :  쿠키 읽기
		//response : 쿠키 설정(저장)

		if(kakao.length != 0) {
			for(int i=0; i<kakao.length;i++) {
				//key, value(이미지가 담겨 있다.)

				String key = "key"+(i+1);
				String value = kakao[i];
				System.out.println(key+"\t"+value);

				Cookie cookie = new Cookie(key, value);
				cookie.setMaxAge(60*60); 				//초*분*시*일 (60*60*24*365)-> 1년 살아있다는 얘기, 사용자가 쿠키폴더 지우면 다 사라지는거지 뭐
				response.addCookie(cookie);

			}

		}

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<header><title></title></header>");

		out.print("<script type='text/javascript'>");
		out.print("alert('장바구니에 담겼습니다.');");
		out.print("location.href='http://localhost:8181/webTesting/Servlet/09_example.html';");
		out.print("</script>");

		out.print("<body>");
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
