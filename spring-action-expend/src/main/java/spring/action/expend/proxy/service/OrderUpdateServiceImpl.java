package spring.action.expend.proxy.service;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lijinpeng on 2019/6/3.
 */
@Slf4j
public class OrderUpdateServiceImpl implements OrderUpdateService {

    public void payOrder(String orderAmt) {
        log.info("订单付款中.....");
    }
}
