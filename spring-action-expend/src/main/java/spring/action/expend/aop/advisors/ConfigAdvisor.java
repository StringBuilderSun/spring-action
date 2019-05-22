package spring.action.expend.aop.advisors;

/**
 * 基于xml配置的切面类
 * Created by lijinpeng on 2019/5/22.
 */
public class ConfigAdvisor {

    public void configBefore() {
        System.out.println("xml配置的切面before");
    }


    public void configAfter() {
        System.out.println("xml配置的切面after");

    }
}
