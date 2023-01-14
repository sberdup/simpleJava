package com.it.berdeja.basics;

import java.util.Scanner;

public class ConvertDecimalToRoman {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}
			
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	

	/**
	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. Works only with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		StringBuilder sb = new StringBuilder();
		//TODO Use 2 arrays to match values and letters and avoid multiple IFs
		if (number == 100) {
			return "C";
		}
		while (number > 0) {
			if (number >= 90) {
				sb.append("XC");
				number -= 90;
			} else if (number >= 50) {
				sb.append("L");
				number -= 50;
			} else if (number >= 40) {
				sb.append("XL");
				number -= 40;
			} else if (number >= 10) {
				sb.append("X");
				number -= 10;
			} else if (number == 9) {
				sb.append("IX");
				number -= 9;
			} else if (number >= 5) {
				sb.append("V");
				number -= 5;
			} else if (number == 4) {
				sb.append("IV");
				number -= 4;
			} else if (number >= 1) {
				sb.append("I");
				number--;
			}
		}
		return sb.toString();
	}

	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number. After method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number
	 */

	public static int roman2Decimal(String romanNumber) {
		int total = 0;
		int currentNumber = 0;
		int lastNumber = 0;
		for (int i = romanNumber.length(); i > 0 ; i--) {
			String currentLetter = romanNumber.substring(i - 1, i);
			//Was inadvertently using == instead of .equals for String comp
			if (currentLetter.equals("I")) {
				currentNumber = 1;
			} else if (currentLetter.equals("V")) {
				currentNumber = 5;
			} else if (currentLetter.equals("X")) {
				currentNumber = 10;
			} else if (currentLetter.equals("L")) {
				currentNumber = 50;
			} else if (currentLetter.equals("C")) {
				currentNumber = 100;
			}
			if (currentNumber >= lastNumber) {
				total += currentNumber;
			} else {
				total -= currentNumber;
			}
			lastNumber = currentNumber;
		}
		return total;
	}


	/**
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 */
	public static boolean isRomanNumberValid(String romanNumber) {
		return romanNumber
				.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		return (decimalNumber >= 1 && decimalNumber <= 100);
	}
}