package ru.mail.agb88.service.DTO;

/**
 * Created by AlexBal 25.11.2017
 */
public class SensorDTO {
    private Integer id;
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

    public static final class Builder {
        private Integer id;
        private Integer value;

        private Builder() {
        }

        public static Builder newSensorDTO() {
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

        public SensorDTO build() {
            SensorDTO sensorDTO = new SensorDTO();
            sensorDTO.setId(id);
            sensorDTO.setValue(value);
            return sensorDTO;
        }
    }
}
