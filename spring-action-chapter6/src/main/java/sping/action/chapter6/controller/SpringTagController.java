package sping.action.chapter6.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 学习Spring 通用标签
 * Created by Administrator on 2018/9/16.
 */
@Controller
@RequestMapping(value = "/springTag")
public class SpringTagController {
    @RequestMapping(method = RequestMethod.GET)
    public String showSpringTag() {
        return "chapter6/springTag";
    }
}
