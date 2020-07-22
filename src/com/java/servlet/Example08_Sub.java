package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example08_Sub
 */

public class Example08_Sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example08_Sub() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String message = request.getParameter("message");
		
		String name = (String)request.getAttribute("name");
		String phone = (String)request.getAttribute("phone");
		System.out.println("Example08_Sub: "+message);
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<header><title></title></header>");
		out.print("<body>");
		
		out.print("<h3 style='color:blue'>"+message+"</h3>");
		out.print("<h3 style='color:blue'>"+name+"</h3>");
		out.print("<h3 style='color:blue'>"+phone+"</h3>");
		
		
		out.print("</body>");
		out.print("</html>");
		
		//include 방식에서 close()는 스트림이 닫혀서 돌아가는 곳에서 출력이 안된다.
		// 하지만 foward는 돌아가지 않기 때문에 된다. 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
