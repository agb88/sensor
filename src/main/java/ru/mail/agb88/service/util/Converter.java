package ru.mail.agb88.service.util;

import org.hibernate.Hibernate;
import ru.mail.agb88.repository.model.Sensor;
import ru.mail.agb88.repository.model.SensorData;
import ru.mail.agb88.service.DTO.SensorDTO;
import ru.mail.agb88.service.DTO.SensorDataDTO;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by AlexBal.
 */
public class Converter {

    public static List<SensorDTO> toSensorDTOs(List<Sensor> sensors) {
        return sensors.stream().map(Converter::toSensorDTO).collect(Collectors.toList());
    }

    private static SensorDTO toSensorDTO(Sensor sensor) {
        SensorDTO sensorDTO = new SensorDTO();
        sensorDTO.setId(sensor.getId());
        sensorDTO.setPassword(sensor.getPassword());
        sensorDTO.setSensorData(toSensorDataDTO(sensor.getSensorData()));

        return sensorDTO;
    }

    private static List<SensorDataDTO> toSensorDataDTO(Set<SensorData> sensorData) {
        return sensorData.stream().map(data -> {
            SensorDataDTO sensorDataDTO = new SensorDataDTO();
            sensorDataDTO.setId(data.getId());
            sensorDataDTO.setSensorId(data.getSensorId());
            sensorDataDTO.setData(data.getData());
            sensorDataDTO.setCreatingDate(new SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(data.getCreatingDate()));

            return sensorDataDTO;
        }).collect(Collectors.toList());
    }

    public static SensorData toSensorData(SensorDataDTO sensorDataDTO) {
        SensorData sensorData = new SensorData();
        sensorData.setId(sensorDataDTO.getId());
        sensorData.setSensorId(sensorDataDTO.getSensorId());
        sensorData.setData(sensorDataDTO.getData());

        return sensorData;
    }
}
