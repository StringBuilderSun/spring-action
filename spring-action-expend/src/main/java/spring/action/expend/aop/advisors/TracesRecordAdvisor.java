package spring.action.expend.aop.advisors;
/**
 * Created by lijinpeng on 2019/5/21.
 */
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TracesRecordAdvisor {


    @Pointcut("execution(* spring.action.expend.aop.services.*.*(..))")
    public void expression() {
    }

    @Before("expression()")
    public void beforePrint()
    {
        System.out.println("进入服务,记录日志开始....");
    }

    @AfterReturning("expression()")
    public void afterPrint()
    {
        System.out.println("退出服务,记录日志退出.....");
    }






}
