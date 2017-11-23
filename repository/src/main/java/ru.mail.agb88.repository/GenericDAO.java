package ru.mail.agb88.repository;


import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, ID extends Serializable> {
    T findById(ID id);

    List<T> findAll();

    void save(T entity);

    void delete(T entity);
}
