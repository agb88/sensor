package ru.mail.agb88.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mail.agb88.repository.SensorDAO;
import ru.mail.agb88.repository.model.Sensor;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.SensorService;
import ru.mail.agb88.service.util.Converter;

import java.util.List;

/**
 * Created by AlexBal 25.11.2017
 */
@Service
public class SensorServiceImpl implements SensorService {
    private SensorDAO sensorDAO;

    @Autowired
    public SensorServiceImpl(SensorDAO sensorDAO) {
        this.sensorDAO = sensorDAO;
    }

    @Override
    public List<SensorDTO> getSensorData() {
        /*List<Sensor> sensors = sensorDAO.getAll();
        List<SensorDTO> sensorsDTO = null;
        sensors.forEach(sensor -> sensorsDTO.add(Converter.sensorToSensorDTO(sensor)));*/
        return null;
    }
}
