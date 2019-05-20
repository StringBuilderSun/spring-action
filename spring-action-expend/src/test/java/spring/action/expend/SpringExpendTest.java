package spring.action.expend;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.action.expend.beanFactoryPostProcess.MyBeanFactoryPostProcess;
import spring.action.expend.model.OfferRewards;
import spring.action.expend.model.SpringSourceModel;
import spring.action.expend.model.ValidateBeanPostPorcessModel;

/**
 * User: lijinpeng
 * Created by Shanghai on 2019/5/19.
 */
public class SpringExpendTest {

    ClassPathXmlApplicationContext applicationContext;

    @Before
    public void init() {
         applicationContext = new ClassPathXmlApplicationContext("spring-expend.xml");
    }

    @Test
    public void expendBeanFactoryPostProcessTest() {
        MyBeanFactoryPostProcess bfpp = (MyBeanFactoryPostProcess) applicationContext.getBean("myBeanFactoryPostProcess");
        applicationContext.addBeanFactoryPostProcessor(bfpp);
        OfferRewards rewards = (OfferRewards) applicationContext.getBean("reward");
        System.out.println(rewards);
    }
    @Test
    public void expendBeanPostProcessTest()
    {
        SpringSourceModel sourceModel= (SpringSourceModel) applicationContext.getBean("springSourceModel");
        System.out.println(sourceModel);
    }
    @Test
    public void expendBeanPostTimes()
    {
        ValidateBeanPostPorcessModel bean= (ValidateBeanPostPorcessModel) applicationContext.getBean("validateBeanPostPorcessModel");
        System.out.println(bean);
    }

}
