package com.ironhack.classes;

public class Helper {
    private static int leadId = 0;
    private static int opportunityId = 0;
    private static int contactId = 0;
    private static int accountId = 0;

    public static int setLeadId() {
        return ++leadId;
    }

    public static int setOpportunityId() {
        return ++opportunityId;
    }

    public static int setContactId() {
        return ++contactId;
    }

    public static int setAccountId() {
        return ++accountId;
    }

}
