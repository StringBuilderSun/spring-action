package spring.action.chapter4.facade;

/**
 * 叫车服务
 * Created by Administrator on 2018/9/2.
 */
public interface CallCarService {
    /**
     * 订车服务
     */
    void orderCar();

    /**
     * 订车服务
     * @param userName 用户订车
     */
    void orderCar1(String userName);
}
