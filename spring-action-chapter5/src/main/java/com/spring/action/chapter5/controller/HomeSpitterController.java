package com.spring.action.chapter5.controller;

import com.spring.action.chapter5.facade.SpitterRepository;
import com.spring.action.chapter5.model.Spitter;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.invoke.util.VerifyAccess;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/9/12.
 */
@Controller
@RequestMapping(value = "/spitters")
public class HomeSpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public HomeSpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String spitters(Model model) {
        model.addAttribute(spitterRepository.findSpitters(Long.MAX_VALUE, 20));
        return "spitters";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(Model model) {
        model.addAttribute("isSkip", spitterRepository.findSpitters(Long.MAX_VALUE, 20));
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistion(Spitter spitter) {
        Spitter newSpitter= spitterRepository.saveSpitter(spitter);
        return "redirect:/spitters/basic/" + newSpitter.getMessage();
    }

    @RequestMapping(value = "/basic/{message}")
    public String showSpitterPage(String message, Model model) {
        Spitter spitter = spitterRepository.findSpitter(message);
        model.addAttribute(spitter);
        return "userPage";
    }
}
