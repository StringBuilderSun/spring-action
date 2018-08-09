package spring.action.chapter3.condaition;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.action.chapter3.condaition.service.MagicServiceBean;

/**
 * Created by Administrator on 2018/8/9.
 */
@Configuration
@ComponentScan(basePackageClasses = {MagicServiceBean.class})
public class ConditionConfig {
}
