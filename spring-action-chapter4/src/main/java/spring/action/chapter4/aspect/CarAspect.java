package spring.action.chapter4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import spring.action.chapter4.exception.SpringAopException;

/**
 * 汽车服务通知
 * Created by Administrator on 2018/9/2.
 */
@Aspect
public class CarAspect {
    //只拦截无参的方法
    @Pointcut("execution(** spring.action.chapter4.facade.CallCarService.orderCar())")
    public void carService() {
    }
    //拦截带有一个参数的方法  参数设置 里面的参数名一定要一一对应
    @Pointcut("execution(* spring.action.chapter4.facade.CallCarService.orderCar(String))&&args(userName)")
    public void carServiceWithArgs(String userName){}
    @Before("carService()")
    public void beforeAdvice() {
        System.out.println("Before:在订车服务之前,首先登陆上APP");
    }

    @After("carService()")
    public void afterAdvice() {
        System.out.println("After:车票预订完成之后，开始付款");
    }

    @AfterReturning("carService()")
    public void afterReturn() {
        System.out.println("afterReturn:车票付款完毕之后，退出APP");
    }

    @Around("carServiceWithArgs(userName)")
    public void around(ProceedingJoinPoint joinPoint,String userName) throws Throwable {
        System.out.println("around:拦截到有参方法 查询到指定车票,用户:"+userName);
        joinPoint.proceed();
        System.out.println("around:拦截到有参方法 车票预订成功,用户:"+userName);
    }
    @AfterThrowing(throwing = "exception", pointcut = "carService()")
    public void afterThrow(SpringAopException exception) {
        System.out.println("拦截到SpringAop异常，异常内容为:" + exception.getMessage());
    }
}
