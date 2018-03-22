package ru.mail.agb88.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.SensorService;

import java.util.List;

/**
 * Created by AlexBal 23.11.2017
 */

@Controller
public class SensorController {

    /*private final Logger logger = Logger.getLogger(SensorController.class);*/
    private SensorService sensorService;

    @Autowired
    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getPage(Model model) {
        List<SensorDTO> sensorDTO = sensorService.getSensorData();
        model.addAttribute("sensor", sensorDTO);
        return "index";
    }
}
