package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@ComponentScan("com.example")
public class DemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class).web(true);
    }

    // public static void main(String[] args) {
    // SpringApplication.run(DemoApplication.class, args);
    // }

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
    }

}
