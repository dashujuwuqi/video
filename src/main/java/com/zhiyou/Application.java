package com.zhiyou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//用来标识Springboot的启动类是一个组合注解，除了包括Java4大原注解以外还包括以下
/**
 * @SpringBootConfiguration:修饰在类上，可以代替xml配置，用来表示这个类是一个xml配置类，一般与@bean结合使用
 * @bean:注解来修饰方法上，该方法的返回值将会被注册到Spring容器中
 * @EnableAutoConfiguration:自动配置Spring上下文，可以猜测和配置我们想要的bean类型
 * @ComponentScan：会自动扫描制动包下的component,controller等注解，并自动注入到ioc容器中，如果不指定路径，默认
 * 扫描自己所在包路径及所有子包。
 * @author 18112
 *
 */
@SpringBootApplication
//@ComponentScan(value="com.zhiyou.controller") //自定义需要扫描的路径
//@ComponentScans(value= {
//		@ComponentScan(value="com.zhiyou.repository"),
//		@ComponentScan(value="com.zhiyou.service")
//})
@MapperScan("com.zhiyou.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
