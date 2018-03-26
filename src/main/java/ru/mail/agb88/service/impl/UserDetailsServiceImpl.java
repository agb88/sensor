package ru.mail.agb88.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import ru.mail.agb88.repository.UserDAO;
import ru.mail.agb88.repository.model.User;
import ru.mail.agb88.service.DTO.UserPrincipal;


@Service("UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    private final Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userDAO.getUser(email);

        if (user == null) {
            logger.info("User not found");
            throw new UsernameNotFoundException("Username not found");
        }

        return new UserPrincipal(user);
    }
}
