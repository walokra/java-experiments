package com.ruleoftech.exp.ajotektiedot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
// Switches on reasonable default behaviors based on the content of your
// classpath
@EnableAutoConfiguration
// Activates Spring Data JPA.
@EnableJpaRepositories
// Spring Data REST is a Spring MVC application.
// Imports a collection of Spring MVC controllers, JSON converters, etc. needed
// to provide a RESTful front end. They link up to the Spring Data JPA backend.
@Import(RepositoryRestMvcConfiguration.class)
public class Application extends SpringBootServletInitializer {

	// bootstrap our application, starting Spring which will in turn start the
	// auto-configured Tomcat web server.
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	// configure Spring servlet for us, and overrides the configure() method to
	// point to itself, so Spring can find the main configuration.
	@Override
	protected final SpringApplicationBuilder configure(
			final SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
