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
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCompanyName(companyName);
        createLeadID();
    }

    //This method calls the Data class method getLeadList() to retrieve the list of Leads and sets the ID for the new
    //Lead. The ID will be equal to the list's size, so when added to the list, it will also be its position in the list.
    //It will also add the Lead to the Lead list whenever it is created.
    private void createLeadID() {
        List<Lead> leadList = Data.getLeadList();
        setId(leadList.size());
        addLeadToList();
    }

    //This method will add a new Lead to a list located in Data everytime a new Lead is instantiated.
    private void addLeadToList() {
        List<Lead> leadList = Data.getLeadList();
        leadList.add(new Lead(getName(), getPhoneNumber(), getEmail(), getCompanyName()));
    }


//  Getters and setters
    public Integer getId() {
        return id;
    }

    //We might use the Helper class to do it.
    public void setId(Integer id) {
        if (id == null) {
            this.id = 0;
        } else this.id = id;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
