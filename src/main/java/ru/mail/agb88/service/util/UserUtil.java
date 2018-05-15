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
public class UserUtil {

    private final static String USER_START_URL = "/user/items";
    private final static String ADMIN_START_URL = "/admin/items";

    /**
     * Returns current user or null.
     */
    public static UserPrincipal getCurrentUser() {
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

                return USER_START_URL;
            } else if (grantedAuthority.getAuthority().equals(Role.ADMIN.name()) || grantedAuthority.getAuthority().equals(Role.SUPER_ADMIN.name())) {

                return ADMIN_START_URL;
            }
        }
        throw new IllegalStateException();
    }
}
