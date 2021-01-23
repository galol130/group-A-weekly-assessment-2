package com.ironhack.classes;

public class Contact {
    private int id;
    private Lead lead;

    public Contact(Lead lead) {
        setId();
        this.lead = lead;
    }

//Getters and setters

    public int getId() {
        return id;
    }

    //Utilizar el helper
    public void setId() {
        this.id = 1;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }
}
