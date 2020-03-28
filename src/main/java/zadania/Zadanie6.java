package zadania;

import zadania.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadanie6 {
    public static void main(String[] args) {
        String sqlInsert = "INSERT INTO country " +
                "(CO_NAME, CO_ALIAS) " +
                "VALUES (?,?)";

        Country[] countries = {new Country("Albania", "AL"),
                new Country("China", "CH"),
                new Country("Ukraina", "UE")};


        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sqlInsert)) {

            DatabaseConnection.getInstance().getConnection().setAutoCommit(false);
            for (int i = 0; i < countries.length; i++) {
                preparedStatement.setString(1, countries[i].getContryName());
                preparedStatement.setString(2, countries[i].getCountryAlias());
                preparedStatement.execute();
            }
            DatabaseConnection.getInstance().getConnection().commit();

        } catch (SQLException e) {
            try {
                DatabaseConnection.getInstance().getConnection().rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}