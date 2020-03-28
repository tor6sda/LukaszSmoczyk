package zadania;

import zadania.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zadanie3 {

    public static void main(String[] args) {
        String sqlUpdate = "UPDATE address "+
                "SET ADD_BUILDING_NO = ?"+
                "WHERE ADD_POSTAL_CODE = ?";
        String selectQuery = "SELECT * from address";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sqlUpdate)){
            preparedStatement.setString(1,"11");
            preparedStatement.setString(2,"38600");
            int countUpdatedRecords = preparedStatement.executeUpdate();
            System.out.println("zaktualizowano " +countUpdatedRecords+" wierszy");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try(PreparedStatement statement = DatabaseConnection.getInstance().getConnection().prepareStatement(selectQuery)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ADD_ID");
                String street = resultSet.getString("ADD_STREET");
                String buildingNo = resultSet.getString("ADD_BUILDING_NO");
                String postalCode = resultSet.getString("ADD_POSTAL_CODE");
                System.out.println("Address id: "+ id + " Street: " + street + " building number: " + buildingNo + " Postal Code: " + postalCode);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
