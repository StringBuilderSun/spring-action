package spring.action.chapter4.facade;

/**
 * Created by Administrator on 2018/9/3.
 */
public interface PayService {
    /**
     * 付款服务
     * @param money 需要支付的金额
     */
    void payService(String money);
}
