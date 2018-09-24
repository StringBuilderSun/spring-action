package sping.action.chapter6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sping.action.chapter6.model.UserInfo;

import javax.validation.Valid;

/**
 * Created by Administrator on 2018/9/16.
 */
@Controller
@RequestMapping(value = "/chapter6/")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister(Model model) {
        //显示一个表单的时候， 如果用Spring form 必须在表单初始化得时候绑定一个model
        model.addAttribute("command", new UserInfo());
        return "chapter6/registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerAndSkipUp(@Valid UserInfo userInfo, Errors errors) {
        System.out.println(userInfo);
        System.out.println("错误"+errors);
        if (errors.hasErrors()) {
            return "chapter6/registerForm";
        }
        System.out.println("注册成功,重定向跳转！！！");
        return "redirect:chapter6/userInfo/" + userInfo.getUserName();
    }

    @RequestMapping(value = "/userInfo/{userName}", method = RequestMethod.GET)
    public String userInfoPage(@PathVariable String userName, Model model) {

        model.addAttribute("userName", userName);
        return "chapter6/userInfo";
    }
}
