package com.ironhack.commands;

import com.ironhack.classes.Contact;
import com.ironhack.classes.Lead;
import com.ironhack.classes.Opportunity;
import com.ironhack.data.Data;
import com.ironhack.enums.Product;
import com.ironhack.enums.Status;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Command {

	public static void commandCaller(String[] command) {
//		The command method is called
		switch (command[0]){
			case "new":
				//El la propia clase lead generar los datos necesarios con los setters.
				//Data.getLeadList().add(new Lead());
				break;
			case "show": //two options
				if(command[1].equals("leads"))
					Data.showLeads();
				else
					Data.showAccounts();
				break;
			case "lookup":
				//Método a ser creado
				//Lead.lookupById(Integer.parseInt(command[2]));
				break;
			case "convert":
				convert(Integer.parseInt(command[1]));
				break;
			case "change":
				//Método a ser creado
				//Opportunity.changeStatus(Integer.parseInt(command[2]));
				break;
			case "exit":
				System.exit(1);
				break;
			default:
				break;
		}
	}

	public static void convert(Integer id){
		// Creado para poder sacar la información de la lista de leads.
		List<Lead> leadList = Data.getLeadList();
		Contact contact = null;

		int index = 0;

		// Bucle para recorrer la lista y encontrar el id del lead que coincide con el id que nos han pasado
		for (int i = 0; i<leadList.size(); i++) {
			// Cuando coincide, creamos el contacto pasandole el lead correspondiente a ese id dado
			if(leadList.get(i).getId() == id) {

				contact = new Contact(leadList.get(i));
				index = i;
				break;

			}
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which is the product?");
		System.out.println("(HYBRID, FLATBED, BOX)");
		String product;
		Product productEnum = null;

		do {
				product = scanner.nextLine().trim().toUpperCase();
			switch (product) {
				case "HYBRID":
					productEnum = Product.HYBRID;
					break;
				case "FLATBED":
					productEnum = Product.FLATBED;
					break;
				case "BOX":
					productEnum = Product.BOX;
					break;
				default:
					System.out.println("That is not a valid input, please write it again.");
			}

		} while(productEnum == null);

		System.out.println("How many trucks?");
		int quantity = scanner.nextInt();

		Data.addOpportunity(new Opportunity(productEnum, quantity, contact, Status.OPEN));
		Data.deleteLead(index);

		// Opportunity(Product product, int quantity, Contact decisionMaker, Status status)


		//Se debe llamar al método de crear Opportunity
		//Luego llamar al método de crear Contact
		//Luego llamar al método de crear Account
		//Por último eliminar el lead del id que llega a este método
	}
}
