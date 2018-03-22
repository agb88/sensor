package ru.mail.agb88.service.util;

import ru.mail.agb88.repository.model.Sensor;
import ru.mail.agb88.service.DTO.SensorDTO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AlexBal.
 */
public class Converter {

    public static List<SensorDTO> toSensorDTOs(List<Sensor> sensors) {
        return sensors.stream().map(Converter::toSensorDTO).collect(Collectors.toList());
    }
    
    public static SensorDTO toSensorDTO(Sensor sensor) {
        SensorDTO sensorDTO = null;
        if (sensor != null) {
            sensorDTO = SensorDTO.Builder.newSensorDTO()
                    .id(sensor.getSensorId())
                    .value(sensor.getValue())
                    .build();
        }
        return sensorDTO;
    }

    public static Sensor toSensor(SensorDTO sensorDTO) {
        return Sensor.Builder.newSensor()
                .sensorId(sensorDTO.getId())
                .value(sensorDTO.getValue())
                .build();
    }
}
