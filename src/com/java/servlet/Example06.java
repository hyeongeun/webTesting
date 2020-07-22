package com.java.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example06
 */
public class Example06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example06() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * request 객체 역할 -사용자 요청 (한글 Encoding 기능, 파라미터 읽기 기능, 서버와 관련된 정보 읽기 기능 , 헤더 일기 기능, 쿠키 일기 기능, 속성처리 기능) 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//한글설정
		request.setCharacterEncoding("utf-8");
		//파라미터 읽기
		int su = Integer.parseInt(request.getParameter("su"));
		System.out.println(su);
		//서버와 관련된 정보 읽기
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		
		StringBuffer URL = request.getRequestURL();  //Uniform Resource Location, http://localhost:8181/webTesting/Servlet/05_example(프로토콜부터 해당 서블릿 파일까지의 경로명)
		String URI = request.getRequestURI();	//Uniform Resource Identifier, webTesting/Servlet/05_example (해당 컨텍스트부터(프로젝트명) 서블릿 파일까지의 경로명)
		String contextPath = request.getContextPath(); // /webTesting(컨텍스트 이름이 나온다.(프로젝트명))
		String servletPath = request.getServletPath(); // /com/java/servlet/Example06 (해당 servlet 풀패키지명)
		
		System.out.println("서버이름: "+serverName);
		System.out.println("서버포트: "+serverPort);
		
		System.out.println("URL: "+URL);
		System.out.println("URI: "+URI);
		System.out.println("컨텍스트(프로젝트명) 경로: "+contextPath);
		System.out.println("서블릿 경로: "+servletPath);
		System.out.println("요청방식: "+ request.getMethod());
		
		//클라이언트 정보 및웹브라우저 관련 정보 읽기
		System.out.println("요청프로토콜: "+request.getProtocol());
		System.out.println("클라이언트주소: "+request.getRemoteAddr());
		System.out.println("클라이언트: "+ request.getRemotePort());
		
		//헤더 읽기 기능 //response에서 파일업로드할때 쓰인다.
		Enumeration<String> header = request.getHeaderNames();
		while(header.hasMoreElements()) {
			String key = header.nextElement();
			String value = request.getHeader(key);
			System.out.println(key +": \t"+value);
		}
		
		//쿠키 읽기 기능 - 쿠키 저장 Response 읽기
		//속성처리 기능
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
