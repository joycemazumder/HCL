package com.jm.EhcacheApp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource("file:C:\\GITHUB Repository\\HCL\\ehcacheconfig.properties")
public class MySqlDbConfig {
	
	@Value("${ehcacheapp.mysqldb.url}")
	private String url;
	
	@Value("${ehcacheapp.mysqldb.username}")
	private String username;

	@Value("${ehcacheapp.mysqldb.password}")
	private String password;
	
	private final String MYSQL_DRIVER="com.mysql.jdbc.Driver";
	
	@Bean
	public JdbcTemplate  jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
 	}
	
	@Bean 
	public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer()
	{
		return new PropertyPlaceholderConfigurer();
	}
	
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource)
	{
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean
	public DataSource dataSource()
	{
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(MYSQL_DRIVER);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
		
	}

}
