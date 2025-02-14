package com.spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TestSpringInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("getRootConfigClasses---->");
		return new Class<?>[] {TestSpringConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfigClasses---->");
		return new Class<?>[] {TestSpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("getServletMappings---->");
		return new String[]{"/"};
	}

}
