package com.it.berdeja.test;

public class objectModding {
	public static void main(String[] args) {
		String[] original = {"apple", "banana", "camel"};
		System.out.println(original[0]);
		System.out.println(original[1]);
		System.out.println(original[2]);
		changeArray(original);
		System.out.println(original[0]);
		System.out.println(original[1]);
		System.out.println(original[2]);
		
		int counter = 4;
		int sum = 0;
		while (counter >= 0) {
			counter--;
			sum++;
		}
		System.out.println(sum);
		
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				if (i < j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	public static void changeArray(String[] array) {
		array[0] = "atom";
		array[1] = "baryon";
		array[2] = "collider";
	}
}