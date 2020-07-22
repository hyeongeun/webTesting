package com.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example07
 */

public class Example07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example07() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response 객체
		//문서타입, 한글 : setContentType 설정
		//출력 : getWriter()
		//쿠키 저장(설정) 기능, 헤더 설정(파일 업로드시) 기능
		//페이지 이동: sendRedirect
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id+"\t"+pwd);
		
		//원래는 db랑 연동해서 값 비교를 해야하는 것이지만 일단은 임시적으로 값 비교해주기
		String dbId = "abc123";
		String dbPwd ="abc123";
		
		if(id.equals(dbId) && pwd.equals(dbPwd)){
			//1.URL, 2.URI
			response.sendRedirect("/webTesting/com/java/servlet/Example07_Success");
		}else {
			
			response.sendRedirect("/webTesting/com/java/servlet/Example07_Fail");
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
