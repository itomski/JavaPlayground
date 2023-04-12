package de.lubowiecki.javaplayground.orm;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper extends AbstractMapper<Product> {

    public ProductMapper() throws Exception {
        super("products");
        createTable();
    }

    @Override
    public boolean insert(Product obj) throws Exception {

        final String SQL = "INSERT INTO " + TABLE +
                " (id,name,created_at,quantity,price)" +
                " VALUES(null, ?, ?, ?, ?)";

        try(Connection connection = DbUtils.createConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL)) {

            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getCreatedAt().toString()); // LocalDate zu java.sql.Date
            stmt.setInt(3, obj.getQuantity());
            stmt.setDouble(4, obj.getPrice());

            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean update(Product obj) throws Exception {

        final String SQL = "UPDATE " + TABLE +
                " SET name = ?,created_at = ?,quantity =?,price = ? WHERE id = ?";

        try(Connection connection = DbUtils.createConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL)) {

            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getCreatedAt().toString()); // LocalDate zu java.sql.Date
            stmt.setInt(3, obj.getQuantity());
            stmt.setDouble(4, obj.getPrice());
            stmt.setDouble(5, obj.getId());

            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public Product create(ResultSet row) throws Exception {
        Product product = new Product();
        product.setId(row.getInt("id"));
        product.setName(row.getString("name"));
        product.setCreatedAt(LocalDate.parse(row.getString("created_at")));
        product.setQuantity(row.getInt("quantity"));
        product.setPrice(row.getDouble("price"));
        return product;
    }

    @Override
    public void createTable() throws Exception {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " ("
                + "id INTEGER, "
                + "name TEXT NOT NULL, "
                + "created_at TEXT NOT NULL, "
                + "quantity INTEGER, "
                + "price REAL, "
                + "PRIMARY KEY(id AUTOINCREMENT)"
                + ")";

        try(Connection connection = DbUtils.createConnection();
            Statement stmt = connection.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
