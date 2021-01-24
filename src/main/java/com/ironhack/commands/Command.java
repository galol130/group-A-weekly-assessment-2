package com.ironhack.commands;

public class Command {

	public static void commandCaller(String[] command) {
//		The command method is called
		switch (command[0]){
			case "new":
				//Método a ser creado
				//Lead.createLead();
				break;
			case "show": //two options
				//if(command[1].equals("lead"))
				//Método a ser creado
				//Lead.showLeads();
				//else
				//Método a ser creado
				//Account.showAccounts();
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
