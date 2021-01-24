package com.ironhack.classes;

public class Lead {
    private int id;
    private String name;
    private String phoneNumber;
    private String companyName;

    public Lead(String name, String phoneNumber, String companyName) {
        setId();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
    }


//  Getters and setters
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
