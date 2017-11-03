package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET,value = "/simple/{id}")
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    User postUser(@RequestBody User user);

    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    User getUser(User user);


}
