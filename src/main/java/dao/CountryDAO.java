package dao;

import zadania.Country;
import zadania.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
    private Connection connection;

    public CountryDAO() {
        try {
            connection = DatabaseConnection.getInstance().getConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Country> getCountries() {
        String query = "SELECT * FROM COUNTRY";
        List<Country> countryList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int countryId = resultSet.getInt("CO_ID");
                String countryName = resultSet.getString("CO_NAME");
                String countryAlias = resultSet.getString("CO_ALIAS");
                countryList.add(new Country(countryId, countryName, countryAlias));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
