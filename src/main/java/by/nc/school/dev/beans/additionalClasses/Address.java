package by.nc.school.dev.beans.additionalClasses;

/**
 * @author Admin
 * @version 1.0
 */
public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;
    private long postcode;

    public Address() {
    }

    public Address(String country, String city, String street, int house, int flat, long postcode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public long getPostcode() {
        return postcode;
    }

    public void setPostcode(long postcode) {
        this.postcode = postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (getHouse() != address.getHouse()) return false;
        if (getFlat() != address.getFlat()) return false;
        if (getPostcode() != address.getPostcode()) return false;
        if (!getCountry().equals(address.getCountry())) return false;
        if (!getCity().equals(address.getCity())) return false;
        return getStreet().equals(address.getStreet());
    }

    @Override
    public int hashCode() {
        int result = getCountry().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getHouse();
        result = 31 * result + getFlat();
        result = 31 * result + (int) (getPostcode() ^ (getPostcode() >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                ", postcode=" + postcode +
                '}';
    }
}