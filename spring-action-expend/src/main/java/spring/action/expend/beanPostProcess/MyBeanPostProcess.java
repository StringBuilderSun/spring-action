package spring.action.expend.beanPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;
import spring.action.expend.model.ValidateBeanPostPorcessModel;

/**
 * 自定义BeanPostProcessor
 * Created by lijinpeng on 2019/5/20.
 */
@Service
public class MyBeanPostProcess implements BeanPostProcessor {
    /**
     * 这个阶段bean的实例已经被创建 而且属性已经设置过了
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ValidateBeanPostPorcessModel) {
            System.out.println("调用自定义MyBeanPostProcess的postProcessBeforeInitialization:" + bean.toString());
        }
        return bean;
    }

    /**
     * 这个阶段的bean已经执行完初始化操作了即 init-method方法已经被执行过了，
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ValidateBeanPostPorcessModel) {
            System.out.println("调用自定义MyBeanPostProcess的postProcessAfterInitialization:" + bean.toString());
        }
        return bean;
    }
}
