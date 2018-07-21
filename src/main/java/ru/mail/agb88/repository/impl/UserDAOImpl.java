package ru.mail.agb88.repository.impl;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ru.mail.agb88.repository.UserDAO;
import ru.mail.agb88.repository.model.User;

import javax.persistence.NoResultException;

/**
 * Created by AlexBal 26.03.2018
 */
@Repository
public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO {

    @Override
    public User getUser(String email) {
        Query query = getSession().createQuery("SELECT u from User u where u.email = :email")
                .setParameter("email", email);

        try {
            return (User) query.getSingleResult();

        } catch (NoResultException nre) {
            // Ignoring no result exception to get null
            return null;
        }
    }
}
