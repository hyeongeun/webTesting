package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example09_CookieGet
 */

public class Example09_CookieGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Example09_CookieGet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Cookie[] cookie = request.getCookies();
		//System.out.println(cookie.length);

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<header><title></title></header>");
		out.print("<body>");

		if(cookie != null) {
			for(int i=0; i<cookie.length; i++) {
				out.println("<h3>"+cookie[i].getName()+"</h3>");
				out.print("<h3>"+cookie[i].getValue()+"</h3>");
			}
			String contextPath = request.getContextPath();
			for(int i=0; i<cookie.length; i++) {
				String imgStr = contextPath+"/img/"+cookie[i].getValue()+".jpg";
				System.out.println(imgStr);
				out.print("<img src='"+imgStr+"' width='150' height='100'/>");
			}			

		} else { 
			out.print("<h3>장바구니 비워짐</h3>");
		}

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
