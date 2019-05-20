package spring.action.expend.model;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by lijinpeng on 2019/5/20.
 */
@Service
@ToString
public class ValidateBeanPostPorcessModel implements BeanNameAware, ApplicationContextAware, BeanFactoryAware,InitializingBean {

    private String initData = null;
    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        System.out.println("调用初始化方法！");
        this.initData = "已经被初始化了";
    }

    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware的setBeanName方法:"+this.toString());
        this.beanName = name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("调用ApplicationContextAware的setApplicationContext方法:"+this.toString());
        this.applicationContext = applicationContext;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware的setBeanFactory方法:"+this.toString());
        this.beanFactory = beanFactory;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean的afterPropertiesSet方法:"+this.toString());
    }
}
