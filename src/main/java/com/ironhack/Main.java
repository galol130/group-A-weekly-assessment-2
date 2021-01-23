package com.ironhack;

import com.ironhack.classes.Input;
import com.ironhack.styles.ConsoleColors;
import com.ironhack.styles.Start;

public class Main {
    public static void main(String[] args) {
//        Print the system header:
        Start.printStart();
//        Display initial menu:
        System.out.println("\nWelcome, please write one of the following:\n" +
                ConsoleColors.BLUE + "Leads\n" + ConsoleColors.WHITE_BOLD +
                "\tWrite: 'New lead' to enter a new lead record.\n" +
                "\tWrite: 'Show leads' to view all current leads.\n" +
                "\tWrite: 'Lookup lead + [id]' to search for a specific lead.\n" +
                ConsoleColors.BLUE + "Opportunities\n" + ConsoleColors.WHITE_BOLD +
                "\tWrite: 'Convert + [id]' to convert a lead into an opportunity.\n" +
                "\tWrite: 'Change status' to change an opportunity status.\n" +
                ConsoleColors.BLUE + "Accounts\n" + ConsoleColors.WHITE_BOLD +
                "\tWrite: 'Show accounts' to view all current accounts.\n" +
                "\n" +
                "\tWrite: 'Quit system' to exit.\n");
//        Call the getCommand method that validates menu input and calls proper methods accordingly.
        Input.getCommand();
    }
}
