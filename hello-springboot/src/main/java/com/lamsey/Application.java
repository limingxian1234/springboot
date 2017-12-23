package com.lamsey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * 类名：Application.java
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月22日 下午8:46:25
 */
/*@Configuration  
@ComponentScan  
@EnableAutoConfiguration  */
@SpringBootApplication
@MapperScan("com.lamsey.mapper")
public class Application {
	 public static void main(String[] args) {  
	        SpringApplication.run(Application.class);  
	    }  
}
