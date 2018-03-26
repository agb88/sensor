package ru.mail.agb88.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mail.agb88.repository.SensorDAO;
import ru.mail.agb88.service.DTO.SensorDTO;
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

    @Autowired
    public SensorServiceImpl(SensorDAO sensorDAO) {
        this.sensorDAO = sensorDAO;
    }

    @Override
    public SensorDTO setData(SensorDTO sensorDTO) {
        sensorDAO.save(Converter.toSensor(sensorDTO));
        return sensorDTO;
    }

    @Override
    public List<SensorDTO> getAll() {
        return Converter.toSensorDTOs(sensorDAO.findAll());
    }
}
