package com.usher.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//导入Spring的配置文件，让配置文件里面的内容生效
//@ImportResource(locations = {"classpath:beans.xml"})

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}
