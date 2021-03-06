package ru.mail.agb88.repository.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by AlexBal 26.03.2018
 */

@MappedSuperclass
public class GeneralEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralEntity generalEntity = (GeneralEntity) o;
        return Objects.equals(id, generalEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
