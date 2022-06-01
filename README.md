# Spring-Security
Technologies used: Spring MVC, Spring Security, In-memory Authentication, CSRF, JDBC

# Lesson 1:
Here first created a class file whose name is DemoAppConfig. In this class there are few annotations. Described those below:
   * Spring @Configuration annotation helps in Spring annotation based configuration. @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
   * 
	 * @ComponentScan support for component scanning which is written in XML as <context:component-scan base-package="com.springsecurity.demo" />
   
	 * @EnabledWebMvc provides similar support to <mvc:annotation-driven /> in XML which adds conversion, formatting and validation support, and it can handle processing of controller classes, @RequestMapping methods and so on.
   
	 * Then there has to implement viewResolver function for view JSP page

Second created MySpringMvcDispatcherServletInitializer which extends AbstractAnnotationConfigDispatcherServletInitializer.
	 * WebApplicationInitializer:
		 WebApplicationInitializer is used for booting Spring web applications. WebApplicationInitializer registers a Spring DispatcherServlet and creates a Spring web application context. Mostly, developers use AbstractAnnotationConfigDispatcherServletInitializer, which is an implementation of the WebApplicationInitializer, to create Spring web applications.
