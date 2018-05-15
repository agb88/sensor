package ru.mail.agb88.repository.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by AlexBal 26.03.2018
 */

@Entity
@Table(name = "USER")
public class User extends GeneralEntity {

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column (name = "PASSWORD")
    private String password;

    @Column (name = "ROLE")
    @Enumerated
    private Role role;

    @Column (name = "ENABLED")
    private boolean isEnabled;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return isEnabled == user.isEnabled &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, password, role, isEnabled);
    }
}
