package com.springsecurity.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*** Creating Spring Dispatcher Servlet Initializer */
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/***
	 * Web.xml file demonstration
	 * First we actually would define a servlet that would reference the Spring dispatcher servlet
	 * We'd set up param that would point to the actual configuration file like our servlet.XML/
	 * DemoAppConfig, and we'd set up a servlet mapping for that dispatcher servlet that'll map on
	 * that euro pattern of just slash
	 *
	 * WebApplicationInitializer:
		 WebApplicationInitializer is used for booting Spring web applications.
		 WebApplicationInitializer registers a Spring DispatcherServlet and creates
		 a Spring web application context. Mostly, developers use
		 AbstractAnnotationConfigDispatcherServletInitializer, which is an implementation of
		 the WebApplicationInitializer, to create Spring web applications.
	 * @return
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






