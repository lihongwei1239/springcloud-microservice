package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

    @Override
    public User postUser(User user) {
        user.setId(0L);
        return user;
    }

    @Override
    public User getUser(User user) {
        user.setId(0L);
        return user;
    }
}
