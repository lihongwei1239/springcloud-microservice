package com.itmuch.config;

import feign.Contract;
import feign.Feign;
import feign.Logger;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FooConfiguration2 {

    @Bean
    public Contract feignContract() {
        return new SpringMvcContract();
    }
    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
