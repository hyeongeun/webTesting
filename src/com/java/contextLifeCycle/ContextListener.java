package com.java.contextLifeCycle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @날짜 :2020. 6. 10.
 * @작성자 : 이형은
 * @설명 : 웹어플리케이션(webTesting / context) 생명주기
 * 
 * Web.xml 등록
 * 	<listener>
		<listener-class>com.java.contextLifeCycle.ContextListener</listener-class>
	</listener>
 */
public class ContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized---------------------");

	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed---------------------");
	
	}
}
