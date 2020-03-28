package zadania;

import zadania.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zadanie2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=CET";
        String user = "root";
        String password = "admin";
        String query = "Select * from address where add_city like \"%\"?\"%\";";
        try (
                PreparedStatement preStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(query);
        ) {
            preStatement.setString(1,"Paris");
            ResultSet resultSet = preStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print( resultSet.getInt("ADD_ID")+" ");
                System.out.print( resultSet.getString("ADD_CITY"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
