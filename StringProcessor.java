package com.it.berdeja;

public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		String[] arr = input.split("\n");
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i<arr.length ; i++) {
			String[] subArray = arr[i].split(";");
			sb.append(subArray[0] + " ==> " + subArray[2] + "\n");
		}
		return sb.toString();
	}
	
	
	public static String convert2(String input) {
		String[] arr = input.split("\n");
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i<arr.length ; i++) {
			String[] subArray = arr[i].split(";");
			//sb.append(subArray[1] + " (email: " + subArray[2] + ")");
			//sb.append("\n");
			sb.append(String.format("%s (email: %s) %n", subArray[1], subArray[2]));
		}
		return sb.toString();
	}

}
