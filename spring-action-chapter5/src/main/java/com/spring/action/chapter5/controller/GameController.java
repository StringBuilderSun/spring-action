package com.spring.action.chapter5.controller;

import com.spring.action.chapter5.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * 字段验证的用法
 * Created by Administrator on 2018/9/14.
 */
@Controller
@RequestMapping(value = "/game")
public class GameController {
    @RequestMapping(method = RequestMethod.GET)
    public String showGame(@Valid Game game, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
        //......一堆操作
        return "userPage";
    }
}
