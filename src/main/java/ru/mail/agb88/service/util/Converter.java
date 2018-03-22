package ru.mail.agb88.service.util;

import ru.mail.agb88.repository.model.Sensor;
import ru.mail.agb88.service.DTO.SensorDTO;

/**
 * Created by AlexBal.
 */
public class Converter {

    // TODO Инициализировать коллекции на уровне web. На веб передавать коллекции пустыми, а по запросу из jsp их инициализировать
    public static SensorDTO sensorToSensorDTO(Sensor sensor) {
        SensorDTO sensorDTO = null;
        if (sensor != null) {
            sensorDTO = SensorDTO.Builder.newSensorDTO()
                    .id(sensor.getId())
                    .value(sensor.getValue())
                    .build();
        }
        return sensorDTO;
    }
}
