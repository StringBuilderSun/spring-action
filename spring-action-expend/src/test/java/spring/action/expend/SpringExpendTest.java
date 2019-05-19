package spring.action.expend;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.action.expend.model.OfferRewards;

/**
 * User: lijinpeng
 * Created by Shanghai on 2019/5/19.
 */
public class SpringExpendTest {

    @Test
    public void expendTest()
    {
        //XmlBeanFactoty
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-expend.xml");
        MyBeanFactoryPostProcess bfpp= (MyBeanFactoryPostProcess) applicationContext.getBean("myBeanFactoryPostProcess");
        applicationContext.addBeanFactoryPostProcessor(bfpp);
        OfferRewards rewards= (OfferRewards) applicationContext.getBean("reward");
        System.out.println(rewards);
    }
}
