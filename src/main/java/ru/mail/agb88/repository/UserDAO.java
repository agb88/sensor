package ru.mail.agb88.repository;

import ru.mail.agb88.repository.model.User;

/**
 * Created by AlexBal 26.03.2018
 */
public interface UserDAO {

    User getUser(String email);
}
