package com.it.berdeja.basics;
import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\.\\?\\!\\s]+"))); //my attempt
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+"))); //using special
	}
}
