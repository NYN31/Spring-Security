package com.springsecurity.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/***
	 WebApplicationInitializer is used for booting Spring web applications.
	 WebApplicationInitializer registers a Spring DispatcherServlet and creates
	 a Spring web application context. Mostly, developers use
	 AbstractAnnotationConfigDispatcherServletInitializer, which is an implementation of
	 the WebApplicationInitializer, to create Spring web applications.
	 ***/
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { DemoAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}






