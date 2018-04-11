package com.usher.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;
//导入Spring的配置文件，让配置文件里面的内容生效
//@ImportResource(locations = {"classpath:beans.xml"})

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootWebApplication.class, args);
	}
	@Bean
	public ViewResolver myViewReolver(){
		return new MyViewResolver();
	}

	public static class MyViewResolver implements ViewResolver {

		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			return null;
		}
	}
}
