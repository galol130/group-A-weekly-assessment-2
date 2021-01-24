package com.ironhack;

import com.ironhack.classes.Account;
import com.ironhack.classes.Input;
import com.ironhack.classes.Lead;
import com.ironhack.classes.Opportunity;
import com.ironhack.commands.Command;
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
        Command.commandCaller(command);
    }
}
