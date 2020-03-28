package zadania;

import dao.CountryDAO;

public class Zadanie8 {

    public static void main(String[] args) {
        CountryDAO dao = new CountryDAO();
        dao.getCountries().forEach(country -> System.out.println(country.getContryName()));
    }
}
