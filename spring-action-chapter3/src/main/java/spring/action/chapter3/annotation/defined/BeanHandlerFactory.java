package spring.action.chapter3.annotation.defined;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * bean处理工厂 负责解析注解  增强功能
 * Created by Administrator on 2018/8/16.
 */
public class BeanHandlerFactory {
    /**
     * 当前环境是 test 环境  业务类型为 addMoney
     * 自定义的原理 ：1 注解的实现类是一个代理对象 2  反射
     *
     * @param target
     */
    public static boolean getDefinedEnvironment(Class<?> target) {
        //如果类实现了MyEnviroment 注解 而且所有字段都使用了MyBusiType注解才返回tyrue
        boolean isMatch =false;
        if (target.isAnnotationPresent(MyEnvironment.class)) {
           MyEnvironment  enviroment = target.getAnnotation(MyEnvironment.class);
            //获取类注解的值
            String name= enviroment.name();
            System.out.println("当前环境:" + name);
            if ("prod".equals(name)) {
                try {
                    Field field = target.getDeclaredField("power");
                    if (field.isAnnotationPresent(MyBusiType.class) && (field.getAnnotation(MyBusiType.class).isCheck() == true)) {
                        isMatch=true;
                        System.out.println("当前业务类型:" + field.getAnnotation(MyBusiType.class).type() + " 启动是否检查:" + field.getAnnotation(MyBusiType.class).isCheck());

                    }
                } catch (NoSuchFieldException e) {
                    System.out.println("抛异常啦！！"+e);
                    isMatch = false;
                }
            }
        }
        return isMatch;
    }
}
