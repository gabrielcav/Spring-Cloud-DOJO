package pl.piomin.microservices.client.model;

public class Client {

    private Integer id;
    private String address;
    private String addressNumber;
    private String city;
    private Boolean isActive;

    public Client () {}

    public Client(Integer id, String address, String addressNumber, String city, Boolean isActive) {
        this.id = id;
        this.address = address;
        this.addressNumber = addressNumber;
        this.city = city;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
