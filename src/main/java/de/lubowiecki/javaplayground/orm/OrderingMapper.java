package de.lubowiecki.javaplayground.orm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class OrderingMapper extends AbstractMapper<Ordering> {

    public OrderingMapper() throws Exception {
        super("orderings");
        createTable();
    }

    @Override
    public boolean insert(Ordering obj) throws Exception {
        return false;
    }

    @Override
    public boolean update(Ordering obj) throws Exception {
        return false;
    }

    @Override
    public Ordering create(ResultSet row) throws Exception {
        Ordering ordering = new Ordering();
        ordering.setId(row.getInt("id"));
        ordering.setCustomer(row.getString("customer"));
        ordering.setTotal(row.getDouble("total"));
        return ordering;
    }

    @Override
    public void createTable() throws Exception {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " ("
                + "id INTEGER, "
                + "customer TEXT NOT NULL, "
                + "total REAL, "
                + "PRIMARY KEY(id AUTOINCREMENT)"
                + ")";

        try(Connection connection = DbUtils.createConnection();
            Statement stmt = connection.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
