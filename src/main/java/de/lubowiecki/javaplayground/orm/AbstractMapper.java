package de.lubowiecki.javaplayground.orm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// T extends AbstractEntity heißt, es können verschiedene Klassen sein, die von AbstractEntity abgeleitet sind
public abstract class AbstractMapper<T extends AbstractEntity> implements Mapper<T> {

    public final String TABLE;

    public AbstractMapper(String table) {
        TABLE = table;
    }

    @Override
    public List<T> find() throws Exception {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection connection = DbUtils.createConnection();
            Statement stmt = connection.createStatement()) {
            List<T> list = new ArrayList<>();
            ResultSet rows = stmt.executeQuery(SQL);
            while(rows.next()) {
                list.add(create(rows));
            }
            return list;
        }
    }

    @Override
    public Optional<T> find(int id) throws Exception {
        try(Connection connection = DbUtils.createConnection();
            Statement stmt = connection.createStatement()) {
            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE id = " + id);
            if(results.next()) {
                return Optional.of(create(results));
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) throws Exception {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection connection = DbUtils.createConnection();
            Statement stmt = connection.createStatement()) {
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    @Override
    public boolean delete(T obj) throws Exception {
        return delete(obj.getId());
    }
}
