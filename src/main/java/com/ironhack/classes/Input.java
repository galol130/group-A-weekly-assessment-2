package com.ironhack.classes;

import java.util.Scanner;

public class Input {

    //Gets a command from user input.
    public static void getCommand() {
        Scanner scanner = new Scanner(System.in);
        String command;
        String[] commandSplit;
        int id;

        while (true) {
            System.out.println("Write a command:");
            command = scanner.nextLine().toLowerCase().trim();
            commandSplit = command.split(" ");
            if (commandSplit.length != 2) {
                System.out.println("Command format must be: [command] [id].");
                continue;
            }
            try {
                if (commandSplit[0].equals("convert")) {
                    id = getInputId(commandSplit[1]);
                    ////////Call to convert method with previous id;
                    break;
                } else {
                    System.out.println("Not a valid command.");
                }
            } catch (Exception e) {
                System.out.println("Something was wrong.");
            }
        }
    }

    public static int getInputId(String idStr) {
        int result = 0;

		try {
			result = Integer.parseInt(idStr);
		}
		catch (NumberFormatException e) {
			System.out.println("Id must be a number.");
		}
		catch (Exception e) {
			System.out.println("Something was wrong.");
		}
		return result;
	}
        try {
            result = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            System.out.println("Id must be a number.");
            idStr = "";
        } catch (Exception e) {
            System.out.println("Something was wrong.");
            idStr = "";
        }
        return result;
    }

    //Validates a command typed by a user, returning the command as an array of strings only if it's a valid one.
    public static String[] getValidCommand() {
        Scanner scanner = new Scanner(System.in);
        String command;
        String[] commandSplit;

        while (true) {
            System.out.println("Type a command:");
            command = scanner.nextLine().toLowerCase().trim();
            commandSplit = command.split(" ");
            //Validates if the command is ok and doesn't require an [id]
            if (command.equals("new lead")
                    || command.equals("show leads")
                    || command.equals("show accounts")
                    || command.equals("exit")) {
                return commandSplit;
            } else if (commandSplit[0].equals("convert")) {
                //Here must validate id is a number
                if (validIdFormat(commandSplit[1]))
                    return commandSplit;
            } else if (commandSplit[0].concat(commandSplit[1]).equals("lookuplead")) {
                //Here must validate id is a number;
                if (validIdFormat(commandSplit[2]))
                    return commandSplit;
            } else if (commandSplit[0].concat(commandSplit[1]).equals("changestatus")) {
                //Here must validate id is a number;
                if (validIdFormat(commandSplit[2]))
                    return commandSplit;
            } else {
                //command is not correct
                System.out.println(ConsoleColors.RED_BOLD + "The command type does not match any available one. Try again!");
            }
        }
    }

    public static boolean validIdFormat(String stringId) {
        try {
            Integer.parseInt(stringId);
            return true;
        } catch (Exception e) {
            System.out.println(ConsoleColors.RED_BOLD + "Error: An integer was expected as an Id");
        }
        return false;
    }

//	public static int getInputNumber(int min, int max) {
//		Scanner scanner = new Scanner(System.in);
//		String	str = "";
//		int		result = 0;
//
//		while (str.length() < 1) {
//			System.out.println("Type a number");
//			str = scanner.nextLine();
//			try {
//				result = Integer.parseInt(str);
//				if (result < min || result > max) {
//					System.out.println("Number must be between " + min + " and " + max + ".");
//					str = "";
//				}
//			}
//			catch (NumberFormatException e) {
//				System.out.println("You must type a number.");
//				str = "";
//			}
//			catch (Exception e) {
//				System.out.println("Something was wrong.");
//				str = "";
//			}
//		}
//		return result;
//	}
}
