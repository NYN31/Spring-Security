package com.springsecurity.demo.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer 
						extends AbstractSecurityWebApplicationInitializer {

	/***
	 * protected AbstractSecurityWebApplicationInitializer() Creates a new instance that assumes
	 * the Spring Security configuration is loaded by some other means than this class.
	 * For example, a user might create a ContextLoaderListener using a subclass of
	 * AbstractContextLoaderInitializer .
	 *
	 * Main purpose to register(triggering, enabling) the Spring Security Filters
	 *
	 * Just need to extend AbstractSecurityWebApplicationInitializer, no need to code, no
	 * need to override code, no need to override methods, nothing to configure
	 ***/
}
