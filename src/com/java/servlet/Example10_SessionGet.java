package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Example10_SessionGet
 */

public class Example10_SessionGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Example10_SessionGet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		if(!session.isNew()) {
			String id = (String)session.getAttribute("id");
			String pwd =(String)session.getAttribute("pwd");

			//System.out.println(id +"\t" +pwd+"\t"+session.getId());


			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();

			out.print("<html>");
			out.print("<header><title></title></header>");


			out.print("<body>");
			out.print("<h3>아이디: " +id +"</h3>");
			out.print("<h3>비밀번호: " +pwd +"</h3>");
			out.print("</body>");
			out.print("</html>");
			out.close();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
