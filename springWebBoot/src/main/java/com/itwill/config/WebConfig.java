package com.itwill.config;
import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/*
web.xml을 대신할 java 클래스
 - DispatcherServlet 초기화
*/
public class WebConfig /*extends AbstractAnnotationConfigDispatcherServletInitializer*/{
	//@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	//@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletConfig.class };
	}

	//@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	//@Override
	protected Filter[] getServletFilters() {
		// CharacterEncodingFilter
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true, true);
		return new Filter[] { characterEncodingFilter };
	}
	

	
}
