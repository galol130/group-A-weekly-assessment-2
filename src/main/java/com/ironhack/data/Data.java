package com.ironhack.data;

import com.ironhack.classes.Account;
import com.ironhack.classes.Contact;
import com.ironhack.classes.Lead;
import com.ironhack.classes.Opportunity;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private static List<Lead> leadList = new ArrayList<>();
	private static List<Opportunity> opportunityList = new ArrayList<>();
	private static List<Contact> contactList = new ArrayList<>();
	private static List<Account> accountList = new ArrayList<>();

	//showLeads() will show a list of all leads' ID and name. It just shows them on the console. As explained in the
	//method createID() in the Lead class, IDs are also the position of each lead in the leadList.
	public static void showLeads() {
		for (Lead lead : leadList) {
			System.out.println("Lead ID: " + lead.getId() + " --> Name: " + lead.getName());
		}
	}

	//lookUpLead will show all the details of a lead on the console. It just iterates through our list of leads and
	//print the information whenever there is a coincidence of IDs.
	public void lookUpLead(int id) {
		for (Lead lead : leadList) {
			if (id == lead.getId()) {
				System.out.println(lead);
			}
		}
	}

	public void convertId(int id) {

		for (Lead lead : leadList) {
			if (id == lead.getId()) {
				contactList.add(new Contact(lead));
				leadList.remove(id);
			}
		}
	}

	public static void showAccounts() {
		for (Account account : accountList) {
			System.out.println(account.toString());
		}
		System.out.println("Just a test, delete later: ACCOUNTS");
	}

	public static List<Lead> getLeadList() {
		return leadList;
	}

	public static List<Opportunity> getOpportunityList() {
		return opportunityList;
	}

	public static List<Contact> getContactList() {
		return contactList;
	}

	public static List<Account> getAccountList() {
		return accountList;
	}

	public static void setLeadList(List<Lead> leadList) {
		Data.leadList = leadList;
	}

	public static void setOpportunityList(List<Opportunity> opportunityList) {
		Data.opportunityList = opportunityList;
	}

	public static void setContactList(List<Contact> contactList) {
		Data.contactList = contactList;
	}

	public static void setAccountList(List<Account> accountList) {
		Data.accountList = accountList;
	}
}
