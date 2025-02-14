package com.spring.web;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.spring")
public class TestSpringConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("viewresolver---->");
		InternalResourceViewResolver vs = new InternalResourceViewResolver();
		vs.setPrefix("WEB-INF/views/");
		vs.setSuffix(".jsp");
		return vs;
	}
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUsername("postgres");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dataSource.setPassword("Smartrecon@123");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

}
