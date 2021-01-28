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
				Data.getLeadList().add(new Lead());
				break;
			case "show":
				if(command[1].equals("leads"))
					Data.showLeads();
				else
					Data.showAccounts();
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
			Contact contact = new Contact(lead);
			Data.getContactList().add(contact);

//			Ask the user about the product, allowing only the options in Product Enumerator
			String prompt = "Which is the product?";
			String product = Input.getEnumUserInput(prompt, (String[]) Arrays.stream(Product.values()).toArray());
			Product productEnum = Product.valueOf(product);

//			Ask the user for the number of trucks
			int trucksQty = Input.getNumberUserInput("How many trucks?");

//			Create new opportunity with the data collected and add it to the list
			Opportunity opp = new Opportunity(productEnum, trucksQty, contact, Status.OPEN);
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
