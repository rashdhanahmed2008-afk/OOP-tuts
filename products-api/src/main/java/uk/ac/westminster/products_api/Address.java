package uk.ac.westminster.products_api;

public class Address {
    public String street;
    public String city;
    public String postcode;

    public Address(){

    }

    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
