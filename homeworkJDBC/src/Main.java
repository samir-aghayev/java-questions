import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String tableFormat = "CREATE TABLE Users(" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(150)," +
                "email VARCHAR(150) CHECK ( email like '%@gmail.com')," +
                "phone_number NUMERIC" +
                ");";
        creatTable(tableFormat);
        insertTable();
    }

    private static void creatTable(String tableFormat) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/homework",
                "postgres",
                "postgres")) {
            Statement query = connection.createStatement();
            query.executeQuery(tableFormat);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private static void insertTable() {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/homework",
                "postgres",
                "postgres")) {
            PreparedStatement query = connection.prepareStatement("INSERT INTO Users(name, email, phone_number) VALUES (?,?,?);");
            query.setString(1, "Human");
            query.setString(2, "human@gmail.com");
            query.setInt(3, 123456789);
            int affectRows = query.executeUpdate();
            System.out.println(affectRows);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
