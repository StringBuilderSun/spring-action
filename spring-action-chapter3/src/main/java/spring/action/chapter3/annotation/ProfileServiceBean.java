package spring.action.chapter3.annotation;

import spring.action.chapter3.annotation.defined.MyBusiType;
import spring.action.chapter3.annotation.defined.MyEnvironment;

/**
 * 自定义注解使用类
 * Created by Administrator on 2018/8/16.
 */
@MyEnvironment(name = "prod")
public class ProfileServiceBean {
    @MyBusiType(type = "add money", isCheck = true)
    private String power;

    @Override
    public String toString() {
        return "ProfileServiceBean{" +
                "power='" + power + '\'' +
                '}';
    }
}
