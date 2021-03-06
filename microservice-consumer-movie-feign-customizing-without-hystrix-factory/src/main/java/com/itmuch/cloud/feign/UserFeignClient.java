package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import com.itmuch.config.FooConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "microservice-provider-user",configuration = FooConfiguration.class,fallbackFactory = HystrixClientFactory2.class)
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET,value = "/simple/{id}")
    User findById(@PathVariable("id") Long id);


}
