package com.java.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Example11
 */
public class Example11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//세션 생성시간
			long createTime = session.getCreationTime();
		
		//세션 마지막 접근시간
			long lastTime = session.getLastAccessedTime();
		
		//마지막 접근시간 - 생성시간 = 사이트 머문시간 // /60000 분당 /6000 초당
			long userTime = (lastTime - createTime) /60000;
			
			Date date = new Date(createTime);
			
			System.out.println("생성시간: "+createTime+"\t" +date);
			System.out.println("마지막 접근시간: "+lastTime +"\t"+ new Date(lastTime).toString());
			System.out.println("머문시간: "+userTime);
			System.out.println();
			
			//5분동안 세션 사용 가능
//			if(userTime < 5) {
//				session.invalidate();
//			}
			int max = session.getMaxInactiveInterval()/60;	//기본값 30분 부여 -서버
			System.out.println(max +"분");
			
			//액션이 없을때(키보드나 마우스 움직이지 않을때)경우 세션시간 설정으로 자동 종료 기본값  //30분 부여-서버 	//(60*2)2분동안 
			session.setMaxInactiveInterval(60*2);
			if(request.isRequestedSessionIdValid()) {
				System.out.println("세션 아이디가 유효합니다.");
			}else {
				System.out.println("세션 아이디가 유효하지 않습니다.");
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
