package ru.mail.agb88.service;

import ru.mail.agb88.service.DTO.SensorDTO;

import java.util.List;

/**
 * Created by AlexBal 25.11.2017
 */
public interface SensorService {
    SensorDTO setData(SensorDTO sensorDTO);

    List<SensorDTO> getAll();
}
