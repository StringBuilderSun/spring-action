package spring.action.chapter4.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import spring.action.chapter4.facade.PayService;
import spring.action.chapter4.serviceImpl.DefaultPayServiceImpl;

/**
 * 引入新方法
 * Created by Administrator on 2018/9/3.
 */
@Aspect
public class EnhanceAspect {

    //+表示CallCarService接口所有的子类，新增接口方法默认的实现类是DefaultPayServiceImpl
    @DeclareParents(value = "spring.action.chapter4.facade.CallCarService+",defaultImpl = DefaultPayServiceImpl.class)
    public PayService payService;

}
