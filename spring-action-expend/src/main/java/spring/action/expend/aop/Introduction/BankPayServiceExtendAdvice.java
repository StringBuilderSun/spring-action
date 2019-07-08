package spring.action.expend.aop.Introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * Created by lijinpeng on 2019/6/4.
 */
public class BankPayServiceExtendAdvice extends DefaultIntroductionAdvisor {

    public BankPayServiceExtendAdvice() {
        //将要添加的方法与advice管理起来
        super(new BankPayServiceIntroductionAdvice(), BankPayExtendService.class);
    }

    public BankPayServiceExtendAdvice(Advice advice) {
        super(advice);
    }
}
