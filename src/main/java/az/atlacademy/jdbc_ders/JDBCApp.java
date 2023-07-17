package az.atlacademy.jdbc_ders;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JDBCApp {
    public static final String getAllCustomers = "SELECT * FROM Customers;";
    public static final String updateCustomerSql = "UPDATE Customers SET first_name=? where first_name=?;";

    public static void main(String[] args) {
        updateCustomers("David", "ILqar").forEach(System.out::println);
        getAllCustomers().forEach(System.out::println);
    }

    private static List<Customers> updateCustomers(String set, String values) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/homework",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(updateCustomerSql);
            query.setString(1, values);
            query.setString(2, set);
            int affectRows = query.executeUpdate();
            System.out.println(affectRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static List<Customers> getAllCustomers() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/homework",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(getAllCustomers);
            ResultSet resultSet = query.executeQuery();
            List<Customers> customers = new ArrayList<>();
            while (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
                customers.add(new Customers(first_name, last_name, address, email));
            }
            return customers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
