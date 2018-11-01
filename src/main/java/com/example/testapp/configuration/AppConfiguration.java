package com.example.testapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {

	@Autowired
	DataSource dataSource;

}
