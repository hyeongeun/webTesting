package com.java.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Example02 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	//init, service, destory 디폴트로 제공된다. 
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String su = request.getParameter("su");
		
		System.out.println("su: " + su);
		
		//문자열 -> 정수
		int value = Integer.parseInt(su);
		
		System.out.println(++value);
		
		//정수 -> 문자열
		String a = String.valueOf(value);
		
		
		Integer i = value;
		String b = i.toString();
		System.out.println(a +"\t"+b);
		
		
	}


}
