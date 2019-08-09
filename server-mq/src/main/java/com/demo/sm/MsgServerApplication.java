package com.demo.sm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
public class    MsgServerApplication {
    @Autowired
    public RestTemplateBuilder restTemplateBuilder;
    public static void main(String[] args) {
        SpringApplication.run(MsgServerApplication.class, args);
    }

    @Bean("mailRestTemplate")
    public RestTemplate restTemplate(){
        return restTemplateBuilder.basicAuthorization("api","4de48b9c86c752ad6454dcf2076a49bb-f877bd7a-51a96699").build();
    }
}
