package spring.action.expend.proxy;

import lombok.extern.slf4j.Slf4j;
import spring.action.expend.proxy.service.OrderUpdateService;
import spring.action.expend.proxy.service.OrderUpdateServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lijinpeng on 2019/6/3.
 */
@Slf4j
public class OrderUpdateServiceImplProxy {

    private OrderUpdateService updateService;

    public OrderUpdateServiceImplProxy(OrderUpdateService updateService) {
        this.updateService = updateService;
    }

    public OrderUpdateService getProxy() {
        return (OrderUpdateService) Proxy.newProxyInstance(OrderUpdateServiceImplProxy.class.getClassLoader(), new Class[]{OrderUpdateService.class}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("payOrder".equals(method.getName())) {
                    log.info("付款前处理");
                    method.invoke(updateService, args);
                    log.info("付款后处理");
                }
                return proxy;
            }

        });
    }


    public static void main(String[] args) {
        OrderUpdateService orderUpdateService = new OrderUpdateServiceImpl();
        OrderUpdateServiceImplProxy proxy = new OrderUpdateServiceImplProxy(orderUpdateService);
        orderUpdateService = proxy.getProxy();
        orderUpdateService.payOrder("100");
    }
}