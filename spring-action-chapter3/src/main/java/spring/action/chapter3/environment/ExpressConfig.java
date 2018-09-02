package spring.action.chapter3.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Administrator on 2018/8/30.
 */
@Configuration
@PropertySource(value = "classpath:chapter3/enviroment.properties")
public class ExpressConfig {
    @Autowired
    private Environment environment;

    @Bean
    public WebSite webSite() {
        return new WebSite(
                environment.getProperty("url"), environment.getProperty("port", Integer.class), environment.getProperty("username"), environment.getProperty("password")
        );
    }
    //Spring提供的属性自动解析发现器
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Bank bank()
    {
        return new Bank();
    }
}
