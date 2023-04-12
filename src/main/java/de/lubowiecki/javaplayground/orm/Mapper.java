package de.lubowiecki.javaplayground.orm;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public interface Mapper<T extends AbstractEntity> {

    // CRUD
    Optional<T> find(int id) throws Exception;

    List<T> find() throws Exception;

    boolean insert(T obj) throws Exception;

    boolean update(T obj) throws Exception;

    boolean delete(int id) throws Exception;

    boolean delete(T obj) throws Exception;

    T create(ResultSet row) throws Exception;

    void createTable() throws Exception;
}
