package com.spring.action.chapter5.controller;

import com.spring.action.chapter5.facade.SpitterRepository;
import com.spring.action.chapter5.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.invoke.util.VerifyAccess;

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
    public String showRegisterForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistion(Spitter spitter) {
        spitterRepository.saveSpitter(spitter);
        return "redirect:/spitters/" + spitter.getId();
    }
}
