package com.it.berdeja;

public class AdminGuestMode {
	public static void main(String[] args) {
		boolean admin = false;
		boolean guest = false;
		for (String word : args) {
			if (word.equals("--admin")) {
				admin = true;
			} else if (word.equals("--guest")) {
				guest = true;
			}
		}
		if (admin ^ guest) {
			System.out.println("Hello, " + (admin ? "Admin" : "Guest") + "!");
		} else {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}
	}
}
