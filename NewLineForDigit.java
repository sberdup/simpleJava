package com.it.berdeja;
import java.util.Scanner;

public class NewLineForDigit {
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String digit = sc.nextLine();
		for (int i = 0; i < digit.length(); i++) {
			System.out.println(digit.charAt(i));
		}
    }
}
