package com.wego.web.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackages = {"com.wego.web"})
@ComponentScan(basePackages = {"com.wego.web"})
public class RootConfig {
	@Bean
	public DataSource dataSource() {
		//책 85 페이지 
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/wego?serverTimezone=UTC");
		hikariConfig.setUsername("wego");
		hikariConfig.setPassword("wego");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		return dataSource;
	}

}
