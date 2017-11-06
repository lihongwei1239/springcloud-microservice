package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClientWithFactory() {
            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(-1l);
                return user;
            }
        };
    }
}
