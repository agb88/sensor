package ru.mail.agb88.config.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.stereotype.Component;
import ru.mail.agb88.service.DTO.UserPrincipal;
import ru.mail.agb88.service.util.UserUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Закрывает доступ зарегистрированным пользователям к страницам "/", "/login", "/register"
 */
@Component
public class UserAccessDeniedHandler extends AccessDeniedHandlerImpl {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        UserPrincipal userPrincipal = UserUtil.getCurrentUser();
        if (userPrincipal != null) {
            response.sendRedirect(UserUtil.getRedirectUrl(userPrincipal));
        } else {
            super.handle(request, response, accessDeniedException);
        }
    }
}
