package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		
		System.out.println(name + "\t" + phone +"\t" + addr );
		
		
		//jstl/el에서 쓰인다. 
		//PrintWriter(출력을 위한 보조스트림 ) - BufferedWriter(char 문자) - OutputStreamWriter(char -> byte) - socket.getOutputStream(byte)
		resp.setContentType("text/html;charset= utf-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head><title></title></head>");
		pw.print("<body>");
		pw.print("<h3>회원 가입이 잘 되었습니다.</h>");
		pw.print("</body>");
		pw.print("<html/>");
		
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
