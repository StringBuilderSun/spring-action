package spring.action.expend;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MissingRequiredPropertiesException;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.ClassPathResource;
import spring.action.expend.beanProcessors.MyBeanPostProcess;

import java.util.Map;

/**
 * Created by lijinpeng on 2019/5/25.
 */
public class SpringYangsenTest {

    @Test
    public void springAopTestService() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-yangsen.xml");
//        applicationContext.getEnvironment().setActiveProfiles("test");
//       Consumer consumer = (Consumer) applicationContext.getBean("yangsen");
//        System.out.println(consumer);
        ClassPathResource resource=new ClassPathResource("spring-yangsen.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.setActiveProfiles("test");
        reader.setEnvironment(environment);
        reader.loadBeanDefinitions(resource);
        MyBeanPostProcess beanPostProcess= (MyBeanPostProcess) beanFactory.getBean("myBeanPostProcess");
        beanFactory.addBeanPostProcessor(beanPostProcess);
        Consumer consumer = (Consumer) beanFactory.getBean("yangsen");
        System.out.println(consumer);
    }
}
