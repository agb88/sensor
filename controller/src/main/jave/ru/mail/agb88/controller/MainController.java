package ru.mail.agb88.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by AlexBal 23.11.2017
 */

@Controller
public class MainController {

    private final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(Model model) {
        logger.info("Main page");
        return "index";
    }
}
