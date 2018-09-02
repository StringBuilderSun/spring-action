package spring.action.chapter4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chapter4.config.SpringAspectConfig;
import spring.action.chapter4.serviceImpl.BusCar;
import spring.action.chapter4.serviceImpl.TrainCar;

/**
 * Created by Administrator on 2018/9/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringAspectConfig.class})
public class SpringAopTest {
    @Autowired
    @Qualifier(value = "busCar")
    private BusCar busCar;
    @Autowired
    @Qualifier(value = "trainCar")
    private TrainCar trainCar;

    @Test
    public void fiveAdvice() {
        busCar.orderCar();
        trainCar.orderCar();
    }
}
