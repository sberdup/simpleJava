package com.it.berdeja;
import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		String[] arr = string.split("\s");
		for (int i = 0; i < arr.length; i++) {
			String lowercase = arr[i].toLowerCase();
			arr[i] = lowercase.substring(0,1).toUpperCase() + lowercase.substring(1);
		}
		return String.join(" ", arr);
	}
}