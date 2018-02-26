package ru.mail.agb88.repository.model;

import javax.persistence.*;

/**
 * Created by AlexBal 25.11.2017
 */
@Entity
@Table(name="T_SENSOR")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "F_ID", insertable = false, updatable = false)
    private Integer id;

    @Column(name = "F_VALUE")
    private Integer value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Sensor() {
    }

    public static final class Builder {
        private Integer id;
        private Integer value;

        private Builder() {
        }

        public static Builder newSensor() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder value(Integer value) {
            this.value = value;
            return this;
        }

        public Sensor build() {
            Sensor sensor = new Sensor();
            sensor.setId(id);
            sensor.setValue(value);
            return sensor;
        }
    }
}
