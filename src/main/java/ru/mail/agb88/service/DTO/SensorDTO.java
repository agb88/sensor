package ru.mail.agb88.service.DTO;

import java.util.List;

/**
 * Created by AlexBal 25.11.2017
 */
public class SensorDTO {
    private Long id;
    private String password;
    private List<SensorDataDTO> sensorData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SensorDataDTO> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorDataDTO> sensorData) {
        this.sensorData = sensorData;
    }
}
