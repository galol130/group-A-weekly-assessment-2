package com.ironhack.styles;

public class Start {
    // The following method prints a welcome screen and sets console colors.
    public static void printStart() {
        int titleLength = 20;
        System.out.println(ConsoleColors.BLUE);
        for (int i = 0; i < titleLength; i++) {
            System.out.print("==");
        }
        System.out.println("\n  CONSUMER RELATIONSHIP MANAGER SYSTEM");
        for (int i = 0; i < titleLength; i++) {
            System.out.print("==");
        }
        System.out.println(ConsoleColors.WHITE_BOLD);
    }

}
