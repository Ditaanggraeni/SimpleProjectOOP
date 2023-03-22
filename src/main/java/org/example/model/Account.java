package org.example.model;
// inheritance class User pada class Account yang dimana class Account memiliki attribute tambahan:
public class Account extends User {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String dob;
    private String pob;
    private Address address; // composition

    //  Implementasikan getter and setter pada attribute Account
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return this.pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    // Implementasikan contructror empty attribute  dan full atribute untuk class Account
    public Account(){
        super();
    }
    public Account(String username, String password, String fullName, String email, String phoneNumber, String dob, String pob, Address address) {
        super(username, password);
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.pob = pob;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName : '" + fullName + '\'' +
                ", address : " + address.getStreet() + " " + address.getDistrict() + ", " + address.getCity() +
                '}';
    }
}
