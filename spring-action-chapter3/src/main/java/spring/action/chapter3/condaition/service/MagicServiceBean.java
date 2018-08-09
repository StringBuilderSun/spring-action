package spring.action.chapter3.condaition.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import spring.action.chapter3.condaition.judgment.MagicExitCondition;

/**
 * Conditional在指定的条件下创建bean
 * 注解里面的参数必须实现Condition接口的matches方法
 * 符合matches方法逻辑判断 才会创建这个bean
 * Created by Administrator on 2018/8/9.
 */
@Component
@Conditional(MagicExitCondition.class)
public class MagicServiceBean {
    public void magicService(String message) {
        System.out.println(message);
    }
}
