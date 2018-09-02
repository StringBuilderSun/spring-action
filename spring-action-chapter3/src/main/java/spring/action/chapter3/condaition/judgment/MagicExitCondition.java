package spring.action.chapter3.condaition.judgment;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 自定义条件匹配
 * @Conditional 里指定符合 matches 条件的bean才会被创建
 * Created by Administrator on 2018/8/9.
 */
public class MagicExitCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //检查环境中是否含有JAVA_HOME环境变量
        Environment environment= conditionContext.getEnvironment();
        return environment.containsProperty("JAVA_HOME");
    }
}
