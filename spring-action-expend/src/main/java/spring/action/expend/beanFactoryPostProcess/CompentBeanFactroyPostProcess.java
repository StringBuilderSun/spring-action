package spring.action.expend.beanFactoryPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Service;

/**
 * Created by lijinpeng on 2019/5/20.
 */
@Service
public class CompentBeanFactroyPostProcess implements BeanFactoryPostProcessor, PriorityOrdered {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("CompentBeanFactroyPostProcess 执行了,优先级别:"+getOrder());
    }

    public int getOrder() {
        return 5;
    }
}
