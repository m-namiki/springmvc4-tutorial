/**
 * 
 */
package com.bns_g.springmvc4.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Bootの実行クラスです。
 * 
 * @author m2-namiki
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	/**
	 * Spring Bootを実行するメソッドです。
	 * 
	 * @param args
	 *            プログラム引数
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.boot.web.support.SpringBootServletInitializer#configure(
	 * org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}
