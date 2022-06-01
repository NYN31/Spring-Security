package com.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.springsecurity.demo")
public class DemoAppConfig {

	/**
	 * @ComponentScan support for component scanning which is written in XML as
	 * <context:component-scan base-package="com.springsecurity.demo" />
	 *
	 * @EnabledWebMvc provides similar support to <mvc:annotation-driven /> in XML which
	 * adds conversion, formatting and validation support, and it can handle processing of
	 * controller classes, @RequestMapping methods and so on.
	 *
	 * Then there has to implement viewResolver function for view JSP page
	 * @return
	 */

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
}









