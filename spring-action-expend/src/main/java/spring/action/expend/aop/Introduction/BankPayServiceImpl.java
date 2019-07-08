package spring.action.expend.aop.Introduction;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lijinpeng on 2019/6/4.
 */
@Slf4j
public class BankPayServiceImpl implements BankPayService {
    public void quickPay(String amt) {
      log.info("订单支付中......");
    }
}
