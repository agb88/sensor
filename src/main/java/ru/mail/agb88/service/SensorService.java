package ru.mail.agb88.service;

import org.springframework.http.HttpStatus;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.DTO.SensorDataDTO;

import java.util.List;

/**
 * Created by AlexBal 25.11.2017
 */
public interface SensorService {
    HttpStatus setData(SensorDataDTO sensorDTO);

    List<SensorDTO> getAll();
}
