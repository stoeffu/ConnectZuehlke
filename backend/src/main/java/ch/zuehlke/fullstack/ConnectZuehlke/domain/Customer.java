package ch.zuehlke.fullstack.ConnectZuehlke.domain;

public class Customer {

    private final Integer id;
    private final String name;
    private final String street;
    private final String city;
    private final String country;
    private final Integer zip;
    private final Double longitude;
    private final Double latitude;

    public Customer(Integer id, String name, String street, String city, String country, Integer zip, Double longitude, Double latitude) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Integer getZip() {
        return zip;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
