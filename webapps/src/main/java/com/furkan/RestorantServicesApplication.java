package com.furkan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.furkan.*"})
@EntityScan(basePackages = {"com.furkan.*"})
@EnableJpaRepositories(basePackages = {"com.furkan.*"})
public class RestorantServicesApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(RestorantServicesApplication.class, args);
    }

}
