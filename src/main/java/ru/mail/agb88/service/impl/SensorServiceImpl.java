package ru.mail.agb88.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mail.agb88.repository.SensorDAO;
import ru.mail.agb88.repository.SensorDataDAO;
import ru.mail.agb88.repository.model.Sensor;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.DTO.SensorDataDTO;
import ru.mail.agb88.service.SensorService;
import ru.mail.agb88.service.util.Converter;

import java.util.List;

/**
 * Created by AlexBal 25.11.2017
 */
@Service
@Transactional
public class SensorServiceImpl implements SensorService {
    private SensorDAO sensorDAO;
    private SensorDataDAO sensorDataDAO;

    @Autowired
    public SensorServiceImpl(SensorDAO sensorDAO, SensorDataDAO sensorDataDAO) {
        this.sensorDAO = sensorDAO;
        this.sensorDataDAO = sensorDataDAO;
    }

    @Override
    public HttpStatus setData(SensorDataDTO sensorDataDTO) {
        Sensor sensor = sensorDAO.findById(sensorDataDTO.getSensorId());

        if (!sensorDataDTO.getPassword().equals(sensor.getPassword())) {
            return HttpStatus.FORBIDDEN;
        }

        sensorDataDAO.save(Converter.toSensorData(sensorDataDTO));

        return HttpStatus.OK;
    }

    @Override
    public List<SensorDTO> getAll() {
        return Converter.toSensorDTOs(sensorDAO.findAll());
    }
}
