package spring.action.chapter3.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import spring.action.chapter3.condaition.ConditionConfig;
import spring.action.chapter3.profile.service.ProfileService;

/**
 * Created by Administrator on 2018/8/8.
 */
@Configuration
@Profile("test")
@ComponentScan(basePackageClasses = {ProfileService.class})
public class ProfileConfig {
}
