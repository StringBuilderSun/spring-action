package spring.action.chapter3.profile.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/8.
 */
@Component
@Profile("prod")
public class ProdProfileServiceImpl implements ProfileService {
    private final Logger log= LoggerFactory.getLogger(ProdProfileServiceImpl.class);
    public void mockService(String message) {
        log.info("生产环境:{}",message);
    }
}
