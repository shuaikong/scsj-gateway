package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GatewayApp.class, args);
	}
}
