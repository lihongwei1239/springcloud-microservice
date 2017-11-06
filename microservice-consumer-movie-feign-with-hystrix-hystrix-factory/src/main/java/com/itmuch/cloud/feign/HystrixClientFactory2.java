package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFactory2 implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(Throwable throwable) {
        return id -> {
            User  user= new User();
            user.setId(-1l);
            return user;
        };
    }
}
