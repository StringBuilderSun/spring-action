package spring.action.chapter3.annotation.defined;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/8/16.
 */
//注解作用于字段
@Target(ElementType.FIELD)
//生命周期 为运行时
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyBusiType {
     //业务类型
    String type() default "";
    //是否检查
    boolean isCheck() default true;
}
