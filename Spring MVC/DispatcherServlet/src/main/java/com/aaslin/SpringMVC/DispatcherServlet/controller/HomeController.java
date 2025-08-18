package com.aaslin.SpringMVC.DispatcherServlet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public ModelAndView home() {
        logger.info("Inside HomeController: handling /home request");
        ModelAndView view = new ModelAndView("home");
        view.addObject("message", "Welcome to Spring MVC DispatcherServlet Flow!");
        return view;
    }
}