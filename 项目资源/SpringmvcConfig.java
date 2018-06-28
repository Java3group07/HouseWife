package com.czxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Springmvc的配置类，提供该配置类，可以需要编写Springmvc相关的配置
 * @author Administrator
 */
@Configuration
//@ComponentScan(basePackages="com.czxy")
@EnableWebMvc//如果传入的有日期类型的数据且按照指定的格式,加该注解
public class SpringmvcConfig {
	
	/**
	 * 视图解析器对象
	 * @return
	 */
	@Bean
	public InternalResourceViewResolver createViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// 设置跳转页面的路径
		resolver.setPrefix("/");
		// 设置文件的后缀名
		resolver.setSuffix(".jsp");
		return resolver;
	}

	/**
	 * 文件上传的解析器对象
	 * 特殊：方法的名称是固定的，必须叫名称multipartResolver
	 */
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		// 创建对象
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		// 设置属性，解决文件名称的中文乱码的问题
		multipartResolver.setDefaultEncoding("UTF-8");
		// 设置上传文件的总大小，设置成10M = 10*1024*1204
		multipartResolver.setMaxUploadSize(10485760);
		// 设置单个上传文件的大小，设置5M
		// multipartResolver.setMaxInMemorySize(maxInMemorySize);
		return multipartResolver;
	}
}
