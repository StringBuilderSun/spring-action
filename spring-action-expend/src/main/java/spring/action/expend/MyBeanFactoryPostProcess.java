package spring.action.expend;

import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;
import sun.misc.BASE64Encoder;

import java.util.HashSet;
import java.util.Set;

/**
 * 字定义的BeanFactoryPostProcess
 * postProcessBeanFactory方法最用于Spring读取完配置文件生成BeanDefination之后
 * 目的 读取所有BeanDefination的，如果BeanDefination里面含有 lijinpeng 转换成 **** (或者加密处理)
 * User: lijinpeng
 * Created by Shanghai on 2019/5/19.
 */
public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {

    private Set<String> sensitiveWords=new HashSet<String>();

    public void setSensitiveWords(Set<String> sensitiveWords) {
        //先清空 敏感词
        sensitiveWords.clear();
        for (String word : sensitiveWords) {
            //统一转换成大写
            this.sensitiveWords.add(word.toUpperCase());
        }
    }

    public boolean isSensitiveWord(String word) {
        return this.sensitiveWords.contains(word.toUpperCase());
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition(beanName);
            final StringValueResolver resolver = new StringValueResolver() {
                //如果是敏感词 就base64编码下
                public String resolveStringValue(String value) {
                    if (isSensitiveWord(value)) {
                        return new BASE64Encoder().encode(value.getBytes());
                    }
                    return value;
                }
            };
            BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(resolver);
            //当访问bd的属性时候 会调用StringValueResolver的resolveStringValue
            visitor.visitBeanDefinition(bd);
        }

    }
}
