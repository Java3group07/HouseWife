package com.czxy.house.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * Spring框架的配置类
 * @author Administrator
 */
@Configuration // 是配置类
@ComponentScan(basePackages="com.czxy") // 扫描指定的包结构
@EnableTransactionManagement // 打开事务注解
public class SpringConfig {
	
	/**
	 * 配置连接池对象
	 */
	@Bean
	public DataSource createDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/house");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	/**
	 * 配置平台事务管理器对象，需要连接池对象
	 */
	@Bean
	@Resource
	public PlatformTransactionManager createTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
}













