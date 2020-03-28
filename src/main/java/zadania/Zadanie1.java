package zadania;

import java.sql.*;

public class Zadanie1 {

    public static void main(String[] args) {


    String url = "jdbc:mysql://localhost:3308/shop?serverTimezone=CET";
    String user = "root";
    String password = null;
    String query = "SELECT * from country;";
        try (
    Connection connection = DriverManager.getConnection(url, user, password);
    Statement statement = connection.createStatement()
        )
    {
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println("Country ID: " +resultSet.getInt("CO_ID"));
            System.out.println("Country Name: "+resultSet.getString("CO_NAME"));
            System.out.println("Country Alias: "+resultSet.getString("CO_ALIAS"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}


