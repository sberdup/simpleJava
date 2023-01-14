package com.it.berdeja.basics;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	    String input = sc.nextLine();
	
		System.out.println("Amount of words in your text: " + getWordsAmount(input));
	}

	public static int getWordsAmount(String text) {
		return text.split(" ").length;
	}
}