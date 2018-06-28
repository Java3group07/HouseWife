package com.czxy.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 启动项的类， tomcat服务器启动的时候，onStartup方法就会执行
 * 
 * @author Administrator
 */
public class WebInit implements WebApplicationInitializer {

	/**
	 * tomcat服务器启动的时候，onStartup方法就会执行
	 */
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 第一步：创建IOC容器，加载那些配置类
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		// 加载配置类，等于把controller service mapper都存入到IOC容器中
		ac.register(SpringConfig.class);
		ac.register(MyBatisConfig.class);
		ac.register(SpringmvcConfig.class);
		// 固定的代码，设置servletContext对象
		ac.setServletContext(servletContext);

		// 添加解决中文乱码的过滤器，解决中UTF-8的中文乱码，让过滤器拦截哪些请求 /*
		javax.servlet.FilterRegistration.Dynamic characterEncodingFilter = servletContext
				.addFilter("characterEncodingFilter", new CharacterEncodingFilter("UTF-8"));
		characterEncodingFilter.addMappingForUrlPatterns(null, true, "/*");

		// 第二步：创建DispatcherServlet（必须有的）
		Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(ac));
		// 调用方法，只处理 .do 结尾的请求
		dispatcherServlet.addMapping("*.do");
		// 启动就创建dispatcherServlet对象
		dispatcherServlet.setLoadOnStartup(1);
	}

}
