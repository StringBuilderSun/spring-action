package spring.action.expend;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.action.expend.aop.services.PayService;


/**
 * Created by lijinpeng on 2019/5/21.
 */

public class SpringAopTest {

    @Test
    public void springAopTestService() {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
        PayService payService= (PayService) applicationContext.getBean("payServiceImpl");
        payService.payMoneyService();

    }
}
