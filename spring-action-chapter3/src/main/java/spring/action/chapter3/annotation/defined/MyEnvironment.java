package spring.action.chapter3.annotation.defined;


import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/8/16.
 */
//定义注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//定义直接的使用范围  这里是类
@Target(ElementType.TYPE)
//将注解添加到java文档中
@Documented
//允许被子类继承
@Inherited
public @interface MyEnvironment {
    String name() default "test";

}
