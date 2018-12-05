package com.bsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * BaseModelApplication
 * @description 项目启动类
 * @author zk
 * @date 2018年11月29日 上午10:41:01
 * @version 1.0
 */
@SpringBootApplication
@MapperScan("com.bsoft.mapper")
@EnableSwagger2
public class BaseModelApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BaseModelApplication.class);
	}
}
