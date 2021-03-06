package com.itwill3.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImplJDBC2;
import com.itwill.user.UserDaoImplJdbcTemplate;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class UserDaoImplJdbcTemplateConfig {
	@Value("${jdbc.driverClassName}")
	String driverClassName;
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.username}")
	String username;
	@Value("${jdbc.password}")
	String password;
	@Bean
	public DataSource apacheDataSource() {
		BasicDataSource dataSource=new  BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);;
		dataSource.setPassword(password);
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(apacheDataSource());
		return jdbcTemplate;
	}
	@Bean
	public UserDao userDao() {
		UserDaoImplJdbcTemplate userDao= new UserDaoImplJdbcTemplate();
		userDao.setJdbcTemplate(jdbcTemplate());
		return userDao;
	}
	
}
