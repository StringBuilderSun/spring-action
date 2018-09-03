package spring.action.chapter4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chapter4.config.SpringAspectConfig;
import spring.action.chapter4.exception.SpringAopException;
import spring.action.chapter4.facade.CallCarService;
import spring.action.chapter4.facade.PayService;

/**
 * Created by Administrator on 2018/9/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringAspectConfig.class})
public class SpringAopTest {
    @Autowired
    @Qualifier(value = "busCar")
    private CallCarService busCar;
    @Autowired
    @Qualifier(value = "trainCar")
    private CallCarService trainCar;

    @Test
    public void fiveAdvice() {
        try {
            busCar.orderCar();
        } catch (SpringAopException e) {
            System.out.println("抛出了springAOP异常！！！");
        }
        try {
            trainCar.orderCar();
        } catch (SpringAopException e) {
            System.out.println("抛出了springAOP异常！！！");
        }
        trainCar.orderCar("李金鹏");
    }

    @Test
    public void springAopAddMethodTest() {
        busCar.orderCar("李兴旺");
        PayService payService = (PayService) busCar;
         payService.payService("100");
    }
}
