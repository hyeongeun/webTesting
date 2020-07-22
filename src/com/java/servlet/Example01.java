package com.java.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Example01 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	//서버 메모리: Content단위로 올라간다. 각각의 Content안에는 Context(webTesting프로젝트)가 있다. 
	public Example01() {
		super();
	}
	
	//생명주기
	public void init() {
			//초기화
		System.out.println("서블릿 파일 초기화(처음 요청 시 단 한번)");
	}
	
	public void service(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		 // 서비스 - get,post 함수 호출
		doGet(request, response);
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		System.out.println("서블릿 내용 doGet함수입니다. ");
//		
//		Cookie[] cookies = request.getCookies();
//		if(cookies.length !=0) {
//			System.out.println("쿠키갯수:" +cookies.length);
//		}
//		
//		HttpSession session = request.getSession();
//		if(!session.isNew()) {
//			String id=(String)session.getAttribute("id");
//			String pwd =(String) session.getAttribute("pwd");
//			
//			System.out.println(id+"\t" +pwd +"\t"+session.getId());
//		}
		
	}

	public void destroy() {
		//소멸
		System.out.println("서블릿 파일 소멸");
	}
}
