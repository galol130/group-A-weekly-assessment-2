package com.ironhack;

import com.ironhack.classes.Account;
import com.ironhack.classes.Input;
import com.ironhack.classes.Lead;
import com.ironhack.classes.Opportunity;
import com.ironhack.styles.ConsoleColors;
import com.ironhack.styles.Start;

public class Main {
    public static void main(String[] args) {
//      Print the system header:
        Start.printStart();
//      Print initial menu (designers gave us different options):
        Start.printMenuV2();
//      Call the getCommand method that validates menu input and calls proper methods accordingly.
        //Input.getCommand();
        String[] command = Input.getValidCommand();

        //The command method is called
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
