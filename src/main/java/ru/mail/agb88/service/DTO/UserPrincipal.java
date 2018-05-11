package ru.mail.agb88.service.DTO;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.mail.agb88.repository.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Сущность для авторизации
 */
public class UserPrincipal implements UserDetails {
    private Collection<? extends GrantedAuthority> authorities;
    private Long id;
    private String email;
    private String password;
    private boolean isEnabled;

    public UserPrincipal(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().name()));
        this.authorities = authorities;
        this.password = user.getPassword();
        this.isEnabled = user.isEnabled();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
