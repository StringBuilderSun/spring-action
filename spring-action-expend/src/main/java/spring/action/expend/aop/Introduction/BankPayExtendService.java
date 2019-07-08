package spring.action.expend.aop.Introduction;

/**
 * Created by lijinpeng on 2019/6/4.
 */
public interface BankPayExtendService {
    /**
     * 扩展的方法
     * @param amt
     */
    void addPayRecord(String amt);
}
