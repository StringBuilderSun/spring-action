package spring.action.expend;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.action.expend.aop.Introduction.BankPayExtendService;
import spring.action.expend.aop.Introduction.BankPayService;

/**
 * Created by lijinpeng on 2019/6/4.
 */
public class SpringIntroductionTest {
    @Test
    public void introductionTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-introduction.xml");
        BankPayService bankPayService = (BankPayService) applicationContext.getBean("proxyFactoryBean");
        ((BankPayExtendService) bankPayService).addPayRecord("100");
        bankPayService.quickPay("100");
    }
}
