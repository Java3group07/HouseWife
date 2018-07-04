package com.czxy.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Springmvc框架的配置类
 * @author Administrator
 */
@Configuration		// 配置类
@EnableWebMvc		// 让mvc框架相关注解生效 解决日期的问题 2018/11/11 2018-1-1 DateTimeForart
public class SpringmvcConfig {
	
	/**
	 * 视图解析器对象（帮助咱们跳转到页面）
	 */
	@Bean
	public InternalResourceViewResolver createViewResolver() {
		// 创建视图解析器对象
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// 设置jsp所在文件夹
		resolver.setPrefix("/pages/");
		// 设置后缀名
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	/**
	 * 异常处理器对象，类自己编写的，使用Compoent注解
	 */
	
	/**
	 * 文件上传解析器对象，如果做文件上传，必须配置。
	 */
	
	/**
	 * 注册拦截器对象
	 */

}











