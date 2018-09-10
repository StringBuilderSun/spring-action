package com.spring.action.chapter5.dispatcher;

import com.spring.action.chapter5.config.RootConfig;
import com.spring.action.chapter5.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Administrator on 2018/9/10.
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //用来配置ContextLoaderListener创建应用上下文的bean
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    //指定配置类  加载我们定义的bean
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    //将DispatcherServlet 映射到 /
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
