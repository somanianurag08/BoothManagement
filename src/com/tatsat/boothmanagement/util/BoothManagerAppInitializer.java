package com.tatsat.boothmanagement.util;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BoothManagerAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Class[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}