package spring.action.chapter4.serviceImpl;

import org.springframework.stereotype.Component;
import spring.action.chapter4.exception.SpringAopException;
import spring.action.chapter4.facade.CallCarService;

/**
 * Created by Administrator on 2018/9/2.
 */
@Component
public class TrainCar implements CallCarService {
    public void orderCar() throws SpringAopException {
        System.out.println("无名氏订购火车票啦！！！");
        throw new SpringAopException("无名氏订购火车票失败！");
    }

    public void orderCar(String userName) {
        System.out.println(userName + "-订购火车票啦！！！");
    }
}
