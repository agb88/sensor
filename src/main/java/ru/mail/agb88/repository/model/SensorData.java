package ru.mail.agb88.repository.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by AlexBal 27.04.2018
 */

@Entity
@Table(name = "SENSOR_DATA")
public class SensorData extends GeneralEntity {

    @Column(name = "SENSOR_ID")
    private Long sensorId;

    @Column(name = "DATA")
    private Float data;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "DATE", updatable = false)
    private Date creatingDate;

    public SensorData() {
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Float getData() {
        return data;
    }

    public void setData(Float data) {
        this.data = data;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }
}
