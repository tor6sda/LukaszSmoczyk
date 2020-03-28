package zadania;

public class Address {

    private int addressId;
    private String addressStreet;
    private String addressBuildingNo;
    private String addressApartamentNo;
    private String addressCity;
    private String addressPostalCode;
    private Country addressCountry;

    public Address() {
    }


    public Address(int addressId, String addressStreet, String addressBuildingNo, String addressApartamentNo, String addressCity, String addressPostalCode, Country addressCountry) {
        this.addressId = addressId;
        this.addressStreet = addressStreet;
        this.addressBuildingNo = addressBuildingNo;
        this.addressApartamentNo = addressApartamentNo;
        this.addressCity = addressCity;
        this.addressPostalCode = addressPostalCode;
        this.addressCountry = addressCountry;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressBuildingNo() {
        return addressBuildingNo;
    }

    public void setAddressBuildingNo(String addressBuildingNo) {
        this.addressBuildingNo = addressBuildingNo;
    }

    public String getAddressApartamentNo() {
        return addressApartamentNo;
    }

    public void setAddressApartamentNo(String addressApartamentNo) {
        this.addressApartamentNo = addressApartamentNo;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public Country getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(Country addressCountry) {
        this.addressCountry = addressCountry;
    }
}


