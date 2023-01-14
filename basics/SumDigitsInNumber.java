package com.it.berdeja.basics;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		String str = Integer.toString(Math.abs(number));
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.valueOf(str.substring(i, i+1));
		}
		return sum;
	}
}