package dtos;

import java.io.Serializable;

public class AddressDTO implements Serializable {
    private Integer id;
    private String addressOne;

    private String AddressTwo;

    private String city;

    public AddressDTO() {
    }

    public AddressDTO(Integer id, String addressOne, String addressTwo, String city) {
        this.id = id;
        this.addressOne = addressOne;
        this.AddressTwo = addressTwo;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return AddressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        AddressTwo = addressTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", addressOne='" + addressOne + '\'' +
                ", AddressTwo='" + AddressTwo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
