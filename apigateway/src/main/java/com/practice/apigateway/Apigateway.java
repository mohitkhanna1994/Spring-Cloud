package com.practice.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Apigateway {
	public static void main(String[] args) {
		SpringApplication.run(Apigateway.class, args);
	}
	
	//Place where can write CORS filters
}
