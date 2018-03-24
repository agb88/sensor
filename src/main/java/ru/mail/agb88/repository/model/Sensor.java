package ru.mail.agb88.repository.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by AlexBal 25.11.2017
 */
@Entity
@Table(name="T_SENSOR")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "F_ID", insertable = false, updatable = false)
    private Long id;

    @Column(name = "F_SENSOR_ID")
    private Long sensorId;

    @Column(name = "F_VALUE")
    private Double value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Sensor() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(id, sensor.id) &&
                Objects.equals(sensorId, sensor.sensorId) &&
                Objects.equals(value, sensor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sensorId, value);
    }

    public static final class Builder {
        private Long id;
        private Long sensorId;
        private Double value;

        private Builder() {
        }

        public static Builder newSensor() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder sensorId(Long sensorId) {
            this.sensorId = sensorId;
            return this;
        }

        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public Sensor build() {
            Sensor sensor = new Sensor();
            sensor.setId(id);
            sensor.setSensorId(sensorId);
            sensor.setValue(value);
            return sensor;
        }
    }
}
