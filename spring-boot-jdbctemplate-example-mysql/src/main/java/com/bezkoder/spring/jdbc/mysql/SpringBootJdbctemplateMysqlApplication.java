package com.bezkoder.spring.jdbc.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootJdbctemplateMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbctemplateMysqlApplication.class, args);
	}

}
