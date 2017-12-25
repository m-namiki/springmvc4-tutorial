/**
 *
 */
package com.bns_g.springmvc4.tutorial.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Repositoryテスト用のConfigクラスです。<br>
 * <code>test-application.properties</code>を読み込み、データソースを作成します。
 *
 * @author m2-namiki
 *
 */
@Configuration
@PropertySource("classpath:/test-application.properties")
public class RepositoryTestConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource(env.getProperty("spring.datasource.url"),
				env.getProperty("spring.datasource.username"), env.getProperty("spring.datasource.password"));
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		return ds;
	}

}
