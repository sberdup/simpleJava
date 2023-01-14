package com.it.berdeja.basics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
	    String[] stringArray = sc.nextLine().split(" ");
	    int[] intArray = new int[stringArray.length];
	    for (int i = 0; i< stringArray.length; i++) {
	    	intArray[i] = Integer.parseInt(stringArray[i]);
	    }
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(findMaxIntInArray(intArray));
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max = 0;
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
