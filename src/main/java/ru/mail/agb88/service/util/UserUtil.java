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

    private final static String USER_START_URL = "/user/account";
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
     * Returns collection with all application roles.
     *
     * @return collection of roles.
     */
    public static List<Role> getAllRoles() {
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
            Role role = Role.valueOf(grantedAuthority.getAuthority());

            if (Role.USER.equals(role)) {
                return USER_START_URL;
            }

            if (Role.ADMIN.equals(role) || Role.SUPER_ADMIN.equals(role)) {
                return ADMIN_START_URL;
            }
        }

        throw new IllegalStateException();
    }
}
