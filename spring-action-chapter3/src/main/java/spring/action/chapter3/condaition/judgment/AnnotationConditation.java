package spring.action.chapter3.condaition.judgment;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import spring.action.chapter3.annotation.ProfileServiceBean;
import spring.action.chapter3.annotation.defined.BeanHandlerFactory;


/**
 * 是否是test环境 而且业务类型是否注解了业务字段
 * Created by Administrator on 2018/8/16.
 */
public class AnnotationConditation implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return BeanHandlerFactory.getDefinedEnvironment(ProfileServiceBean.class);
    }
}
