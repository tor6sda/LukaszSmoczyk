package zadania;

public class Country {

    private int countryId;
    private String contryName;
    private String countryAlias;

    public Country() {
    }

    public Country(int countryId, String contryName, String countryAlias) {
        this.countryId = countryId;
        this.contryName = contryName;
        this.countryAlias = countryAlias;
    }

    public Country(String contryName, String countryAlias) {
        this.contryName = contryName;
        this.countryAlias = countryAlias;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getContryName() {
        return contryName;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public String getCountryAlias() {
        return countryAlias;
    }

    public void setCountryAlias(String countryAlias) {
        this.countryAlias = countryAlias;
    }
}
