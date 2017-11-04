package com.itmuch.config;

import feign.Contract;
import feign.Logger;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Contract feignContract() {
        return new SpringMvcContract();
    }
    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }

}
