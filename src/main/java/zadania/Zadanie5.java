package zadania;

import zadania.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadanie5 {
    /*
     * Napisz program który dopisze do Produktów o id 1,3,5 frazę " - BRAK" -
     * skorzystaj z sparametryzowanego PreparedStatement. Wyświetl ile rekordów zostało zaktualizowanych
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("? ");
        String questionMark = ",?";
//        update product set PRO_DESCRIPTION=CONCAT(PRO_DESCRIPTION, '-BRAK') where PRO_ID in (1,3);
        int tablica[] = new int[]{1, 2, 5};
        for (int i = 1; i < tablica.length; i++) {
            stringBuilder.append(questionMark);
        }

        String query = "Update product SET PRO_DESCRIPTION=CONCAT(PRO_DESCRIPTION, '-BRAK') WHERE PRO_ID in (" + stringBuilder.toString() + ");";
        System.out.println(query);
        String query2 = "SELECT * from product";

        try (
                PreparedStatement preStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(query);
        ) {
            for (int i = 0; i < tablica.length; i++) {

                System.out.println(i+1+" "+tablica[i]);
                preStatement.setInt(i + 1, tablica[i]);

            }
            int countUpdatedRecords = preStatement.executeUpdate();
            System.out.println("Zaktualizowano rekordów "+countUpdatedRecords);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
