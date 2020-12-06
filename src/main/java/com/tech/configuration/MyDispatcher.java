package com.tech.configuration;

import javax.servlet.Filter;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.tech.configuration.MyContext;
import com.tech.configuration.MyJpa;

public class MyDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {MyJpa.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MyContext.class};
	}


	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	
}
