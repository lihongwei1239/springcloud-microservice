package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import com.itmuch.config.FooConfiguration;
import com.itmuch.config.FooConfiguration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user", configuration = FooConfiguration2.class,fallbackFactory = HystrixClientFactory2.class)
public interface UserFeignClient2 {

    @RequestMapping(method = RequestMethod.GET,value = "/simple/{id}")
    User findById(@PathVariable("id") Long id);
}