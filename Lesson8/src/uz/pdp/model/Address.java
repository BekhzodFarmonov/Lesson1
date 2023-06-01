package uz.pdp.model;

public class Address implements Cloneable{
    private String street;
    private String homeNumber;

    public Address() {
    }

    public Address(String street, String homeNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address=new Address();
        address.setStreet(this.street);
        address.setHomeNumber(this.homeNumber);
        return address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }
}
