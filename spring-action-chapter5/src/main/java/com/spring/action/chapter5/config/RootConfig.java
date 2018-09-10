package com.spring.action.chapter5.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Administrator on 2018/9/10.
 */
@Configurable
@ComponentScan(basePackages = {"com.spring.action.chapter5.controller"}, excludeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION, value = EnableWebMvc.class
)})
public class RootConfig {

}
