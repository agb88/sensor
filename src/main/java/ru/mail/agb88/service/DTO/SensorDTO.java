package ru.mail.agb88.service.DTO;

/**
 * Created by AlexBal 25.11.2017
 */
public class SensorDTO {
    private Long id;
    private Long value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public static final class Builder {
        private Long id;
        private Long value;

        private Builder() {
        }

        public static Builder newSensorDTO() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder value(Long value) {
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
