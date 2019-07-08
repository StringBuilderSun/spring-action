package spring.action.expend.aop.Introduction;

/**
 * Created by lijinpeng on 2019/6/4.
 */
public interface BankPayService {
    /**
     * 付款服务
     * @param amt
     */
    void quickPay(String amt);
}
