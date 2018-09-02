package spring.action.chapter4.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.action.chapter4.aspect.CarAspect;

/**
 * Created by Administrator on 2018/9/2.
 */
@Configurable
@ComponentScan(basePackages = {"spring.action.chapter4"})
@EnableAspectJAutoProxy  //启动切面的自动代理
public class SpringAspectConfig {

    @Bean
    public CarAspect carAspect()
    {
        return new CarAspect();
    }
}
