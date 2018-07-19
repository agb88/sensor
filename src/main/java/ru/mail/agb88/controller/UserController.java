package ru.mail.agb88.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mail.agb88.service.DTO.SensorDataDTO;
import ru.mail.agb88.service.SensorService;

/**
 * Created by AlexBal 23.11.2017
 */

@Controller
public class UserController {

    private SensorService sensorService;

    @Autowired
    public UserController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData(Model model) {
        model.addAttribute("sensors", sensorService.getAll());

        return "data";
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public ResponseEntity setData(SensorDataDTO sensorDataDTO) {
        return new ResponseEntity(sensorService.setData(sensorDataDTO));
    }

    @RequestMapping(value = "/user/account", method = RequestMethod.GET)
    public String getAccount (Model model) {
        return "account";
    }
}
