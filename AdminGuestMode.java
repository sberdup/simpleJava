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
		/* Alternate method
		 * 		String admin = "--admin";
		String guest = "--guest";
		String inputArgs = String.join(",", args);
		if (inputArgs.contains(admin) && inputArgs.contains(guest)) {
		    System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		} else if (inputArgs.contains(admin)) {
			System.out.println("Hello, Admin!");
		} else {
		    System.out.println("Hello, Guest!");
		}
		 */
	}
}
