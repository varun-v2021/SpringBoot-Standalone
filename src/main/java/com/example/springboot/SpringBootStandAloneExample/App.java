package com.example.springboot.SpringBootStandAloneExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
 * Spring Boot provides SpringApplication class to bootstrap a Spring
 * application that will be started from a main() method using static
 * SpringApplication.run method.
 */
@EnableAutoConfiguration
@ComponentScan("com.example.springboot.SpringBootStandAloneExample")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

/*
 * We would be using Freemarker templates in our app. Spring Boot
 * WebMvcAutoConfiguration adds FreeMarkerViewResolver with id
 * ‘freeMarkerViewResolver’ if freemarker jar is in classpath, which is the case
 * since we are using spring-boot-starter-freemarker. It looks for resources in
 * a loader path (externalized to spring.freemarker.templateLoaderPath, default
 * ‘classpath:/templates/’) by surrounding the view name with a prefix and
 * suffix (externalized to spring.freemarker.prefix and
 * spring.freemarker.suffix, with empty and ‘.ftl’ defaults respectively). It
 * can be overridden by providing a bean of the same name
 * 
 */
