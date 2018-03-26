package ru.mail.agb88.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.SensorService;

/**
 * Created by AlexBal 23.11.2017
 */

@Controller
public class SensorController {

    private SensorService sensorService;

    @Autowired
    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData(Model model) {
        model.addAttribute("sensors", sensorService.getAll());
        return "data";
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public ResponseEntity setData(SensorDTO sensorDTO) {
        sensorService.setData(sensorDTO);
        return new ResponseEntity(HttpStatus.OK);
    }
}
