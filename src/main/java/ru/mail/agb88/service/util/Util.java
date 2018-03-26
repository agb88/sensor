package ru.mail.agb88.service.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import ru.mail.agb88.repository.model.Role;
import ru.mail.agb88.service.DTO.UserPrincipal;

import java.util.*;

/**
 * Created by AlexBal.
 */
public class Util {

    /**
     * Returns logged in user.
     *
     * @return logged in user.
     */
    public static UserPrincipal findLoggedInUser() {
        UserPrincipal userPrincipal = null;
        Object o = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (o instanceof UserDetails) {
            userPrincipal = ((UserPrincipal) o);
        }
        return userPrincipal;
    }

    /**
     * Returns collection of roles.
     *
     * @return collection of roles.
     */
    public static List<Role> getRolesList() {
        List<Role> roles = new ArrayList<>();
        Collections.addAll(roles, Role.values());
        return roles;
    }

    /**
     * Finds url for redirect.
     * Url depends on user role in collection of granted authorities.
     *
     * @return url for redirect.
     */
    public static String getRedirectUrl(UserDetails userDetails) {
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals(Role.USER.name())) {
                return "/user/items";
            } else if (grantedAuthority.getAuthority().equals(Role.ADMIN.name()) || grantedAuthority.getAuthority().equals(Role.SUPER_ADMIN.name())) {
                return "/admin/items";
            }
        }
        throw new IllegalStateException();
    }
}
