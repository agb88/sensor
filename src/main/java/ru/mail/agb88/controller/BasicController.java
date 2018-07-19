package ru.mail.agb88.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mail.agb88.service.DTO.UserPrincipal;
import ru.mail.agb88.service.util.UserUtil;

/**
 * Created by AlexBal 26.03.2018
 */
@Controller
public class BasicController {

    /**
     * Login page
     */
    @RequestMapping(value = {"/login", "/"}, method = RequestMethod.GET)
    public String login() {
        UserPrincipal userPrincipal = UserUtil.getCurrentUser();
        if (userPrincipal != null) {
            return "redirect:" + UserUtil.getRedirectUrl(userPrincipal);
        }
        return "login";
    }
}
