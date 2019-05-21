package spring.action.expend.aop.services;
import org.springframework.stereotype.Service;

/**
 * Created by lijinpeng on 2019/5/21.
 */
@Service
public class PayServiceImpl implements PayService {

    public void payMoneyService() {
        System.out.println("付款服务正在进行...");
    }

}
