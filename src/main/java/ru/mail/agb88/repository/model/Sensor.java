package ru.mail.agb88.repository.model;

import javax.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by AlexBal 25.11.2017
 */
@Entity
@Table(name = "SENSOR")
public class Sensor extends GeneralEntity {

    public Sensor() {
    }

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany
    @JoinColumn(name = "SENSOR_ID")
    @OrderBy(value = "creatingDate desc")
    private Set<SensorData> sensorData = new LinkedHashSet<>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<SensorData> getSensorData() {
        return sensorData;
    }

    public void setSensorData(Set<SensorData> data) {
        this.sensorData = data;
    }
}
