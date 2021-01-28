package com.ironhack.classes;

import com.ironhack.data.Data;

import java.util.ArrayList;
import java.util.List;

public class Lead {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;

    public Lead(String name, String phoneNumber, String email, String companyName) {
        setId(Helper.setLeadId());
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCompanyName(companyName);
    }

//  Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Input.getStringUserInput("Please, write the name:");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Input.getStringUserInput("Please, write the phone number:");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Input.getStringUserInput("Please, write the email:");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = Input.getStringUserInput("Please, write the city:");
    }

    @Override
    public String toString() {
        return "Lead ID: " + id +
                " --- Name: " + name +
                " --- Phone Number: " + phoneNumber +
                " --- Email: " + email +
                " --- Company Name: " + companyName;
    }
}
