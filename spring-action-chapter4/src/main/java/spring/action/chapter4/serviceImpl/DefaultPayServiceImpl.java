package spring.action.chapter4.serviceImpl;

import org.springframework.stereotype.Component;
import spring.action.chapter4.facade.PayService;

/**
 * Created by Administrator on 2018/9/3.
 */
@Component
public class DefaultPayServiceImpl implements PayService {
    public void payService(String money) {
        System.out.println("此次共付款:" + money + "元");
    }
}
