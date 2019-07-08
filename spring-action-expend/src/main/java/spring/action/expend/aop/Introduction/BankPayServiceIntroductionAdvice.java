package spring.action.expend.aop.Introduction;


import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 使用默认的DelegatingIntroductionInterceptor会在方法前执行新增方法
 * Created by lijinpeng on 2019/6/4.
 */
@Slf4j
public class BankPayServiceIntroductionAdvice extends DelegatingIntroductionInterceptor implements BankPayExtendService {
    public void addPayRecord(String amt) {
        log.info("付款前操作，添加记录.....");
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }
}
