package com.ironhack.commands;

import com.ironhack.classes.*;
import com.ironhack.data.Data;
import com.ironhack.enums.Product;
import com.ironhack.enums.Status;
import com.ironhack.styles.ConsoleColors;

import java.util.Arrays;
import java.util.Scanner;

public class Command {

	public static void commandCaller(String[] command) {

		switch (command[0]){
			case "new":
				try {
					Lead newLead = new Lead();
					Data.getLeadList().add(newLead);
					System.out.println(ConsoleColors.WHITE_BOLD + "Lead created successfully with ID: " + newLead.getId());
				}catch (Exception e) {
					System.out.println(ConsoleColors.RED_BOLD + "Couldn't save the Lead. Try again!");
					System.out.println(ConsoleColors.WHITE_BOLD);
				}
				break;
			case "show":
				if(command[1].equals("leads"))
					Data.showLeads();
				else if(command[1].equals("accounts"))
					Data.showAccounts();
				else
					Data.showOpportunities();
				break;
			case "lookup":
				Data.lookUpLead(Integer.parseInt(command[2]));
				break;
			case "convert":
				convert(Integer.parseInt(command[1]));
				break;
			case "change":
				Data.changeOpportunityStatus(Integer.parseInt(command[2]));
				break;
			case "exit":
				System.out.println(ConsoleColors.YELLOW_BOLD + "Thank you for using E.M.O.F. CRM!");
				System.exit(1);
				break;
			default:
				break;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println(ConsoleColors.WHITE_BOLD + "Press 'Intro' to continue");
		sc.nextLine();
	}

	public static void convert(Integer id){
//		First we get the Lead using the id
		Lead lead = Data.getLeadById(id);

		if(lead != null) {
//			Create contact using information in lead and add it to the list
			Contact contact = new Contact(lead.getName(), lead.getPhoneNumber(), lead.getEmail(), lead.getCompanyName());
			Data.getContactList().add(contact);

//			Create opportunity with contact information. The other fields are asked by the class.
			Opportunity opp = new Opportunity(contact);
			Data.getOpportunityList().add(opp);

//			Create account and add it to the list
			Data.getAccountList().add(new Account(Data.getContactList(), Data.getOpportunityList()));

			System.out.println(ConsoleColors.WHITE_BOLD + "Lead ID: " + lead.getId() + " converted successfully!");

// 			Finally, the lead is deleted
			Data.deleteLead(lead.getId());

		}else{
			System.out.println(ConsoleColors.RED_BOLD + "Error fetching the ID! Check the ID. If error persists, contact admin");
			System.out.println(ConsoleColors.WHITE_BOLD);
		}
	}
}
