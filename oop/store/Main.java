package com.it.berdeja.oop.store;

import java.util.Scanner;

public class Main {
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			Menu mainMenu = new MainMenu();
			mainMenu.start();
		} while (!sc.next().equals(EXIT_COMMAND));
	}
}
