# Spring-Security
Technologies used: Spring MVC, Spring Security, In-memory Authentication, CSRF, JDBC

# Lesson 1: Getting started with Spring MVC and Spring Security
<body>
Here first created a class file whose name is <b>DemoAppConfig</b> and home.jsp file for view. In this class there are few annotations. Described those below:
	<ul>
		<li>Spring @Configuration annotation helps in Spring annotation based configuration. @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.</li>
		<li>@ComponentScan support for component scanning which is written in XML as context:component-scan base-package="com.springsecurity.demo" </li>
		<li>@EnabledWebMvc provides similar support to mvc:annotation-driven in XML which adds conversion, formatting and validation support, and it can handle processing of controller classes, @RequestMapping methods and so on.</li>
		<li>Then there has to implement viewResolver function for view JSP page</li>
	</ul>

Second created <b>MySpringMvcDispatcherServletInitializer</b> which extends <b>AbstractAnnotationConfigDispatcherServletInitializer</b>.
	<ul>
		<li><b>WebApplicationInitializer:</b> WebApplicationInitializer is used for booting Spring web applications. WebApplicationInitializer registers a Spring DispatcherServlet and creates a Spring web application context. Mostly, developers use AbstractAnnotationConfigDispatcherServletInitializer, which is an implementation of the WebApplicationInitializer, to create Spring web applications.</li>
	</ul>
Thirdly created <b>SecurityWebApplicationInitializer</b> which extends <b>AbstractSecurityWebApplicationInitializer</b>.
	<ul>
		<li>Main purpose to register(triggering, enabling) the Spring Security Filters</li>
		<li>Just need to extend AbstractSecurityWebApplicationInitializer, no need to code, no need to override code, no need to override methods, nothing to configure</li>
	</ul>
Finally created <b>DemoSecurityConfig</b> which extends <b>WebSecurityConfigAdapter</b>.
	<ul>
		<li>The @EnableWebSecurity enables the web securities defined by WebSecurityConfigurerAdapter automatically. </li>
		<li>In-memory authentication used. Here for easily learning purpose I used In-memory authentication which means auto generated user with username, password and role</li>
		<li>Needs to override methods which has different arguments</li>
	</ul>
</bod>

# Lesson 2: Custom Log In form

<body>
Added plain-login JSP page.
</body>

# Lesson 3/4: Add bootstrap and logout feature

<body>
	fancy-login page added which is implement wit bootstrap. And login logout functionalities added.
	<code>

		http.authorizeRequests().anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/showMyLoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
			.and()
				.logout().permitAll();
	</code>
	
</body>

# Lesson 5: CSRF token
<body>
	Manually added CSRF token
	<p>
		<b>CSRF: </b> A security attack where an evil website tricks you into executing an action on a web application that you are currently logged in.
		The Spring security filter generates the CSRF token and send back to web browser and can use in HTML form and send the data over accordingly and ten spring security filters will verify the tokens.
		<code>
			<input type="hidden"
					name="${_csrf.parameterName}"
					value="${_csrf.token}" />
		</code>
	</p>
</body>
