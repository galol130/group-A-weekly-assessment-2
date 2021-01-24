package com.ironhack.classes;

import com.ironhack.enums.Industry;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private Industry industry;
    private int employeeCount;
    private String city;
    private String country;
    private List<Contact> contactList;
    private List<Opportunity> opportunityList;

    public Account(List<Contact> contactList, List<Opportunity> opportunityList) {
        Helper.setAccountId();
        setIndustry();
        setEmployeeCount();
        setCity();
        setCountry();
        setContactList(contactList);
        setOpportunityList(opportunityList);
    }


//  Getters and setters
    public int getId() {
        return id;
    }

    public Industry getIndustry() {
        return industry;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Opportunity> getOpportunityList() {
        return opportunityList;
    }

    public void setIndustry() {
        String option;
        option = Input.getEnumUserInput("Please, write the industry:", (String[]) Arrays.stream(Industry.values()).toArray());
        this.industry = Industry.valueOf(option);
    }

    public void setEmployeeCount() {
        this.employeeCount = Input.getNumberUserInput("Please, write the number of employees:");
    }

    public void setCity() {
        this.city = Input.getStringUserInput("Please, write the city:");
    }

    public void setCountry() {
        this.country = Input.getStringUserInput("Please, write the country:");
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void setOpportunityList(List<Opportunity> opportunityList) {
        this.opportunityList = opportunityList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", industry=" + industry +
                ", employeeCount=" + employeeCount +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", contactList=" + contactList +
                ", opportunityList=" + opportunityList +
                '}';
    }
}
