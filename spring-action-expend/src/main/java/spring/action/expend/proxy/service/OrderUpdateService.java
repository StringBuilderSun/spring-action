package spring.action.expend.proxy.service;

/**
 * Created by lijinpeng on 2019/6/3.
 */
public interface OrderUpdateService {
    /**
     * 订单付款
     * @param orderAmt
     */
    void payOrder(String orderAmt);
}
