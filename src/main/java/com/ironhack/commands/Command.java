package com.ironhack.commands;

import com.ironhack.classes.Lead;
import com.ironhack.data.Data;

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
		//Se debe llamar al método de crear Opportunity
		//Luego llamar al método de crear Contact
		//Luego llamar al método de crear Account
		//Por último eliminar el lead del id que llega a este método
	}
}
