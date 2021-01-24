package com.ironhack.classes;

import java.util.Scanner;

public class Input {

	//Gets a command from user input.
	public static void getCommand() {
		Scanner		scanner = new Scanner(System.in);
		String		command;
		String[]	commandSplit;
		int			id;

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
				}
				else {
					System.out.println("Not a valid command.");
				}
			}
			catch (Exception e) {
				System.out.println("Something was wrong.");
			}
		}
	}

	public static int getInputId(String idStr) {
		int		result = 0;

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
