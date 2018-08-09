package spring.action.chapter3.profile.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/8.
 */
@Component
@Profile("test")
public class TestProfileServiceImpl implements ProfileService {
    private final Logger log= LoggerFactory.getLogger(TestProfileServiceImpl.class);
    public void mockService(String message) {
        log.info("测试环境:{}",message);
    }
}
