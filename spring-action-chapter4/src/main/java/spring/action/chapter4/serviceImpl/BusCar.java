package spring.action.chapter4.serviceImpl;


import org.springframework.stereotype.Component;
import spring.action.chapter4.facade.CallCarService;

/**
 * Created by Administrator on 2018/9/2.
 */
@Component
public class BusCar implements CallCarService {
    public void orderCar() {
        System.out.println("无名氏订购汽车票啦！！！");
    }

    public void orderCar1(String userName) {
        System.out.println(userName + "-订购汽车票啦！！！");
    }
}
