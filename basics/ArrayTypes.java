package com.it.berdeja.basics;

import java.util.Arrays; //I did not type this, Eclipse imported after using Arrays.methods below

public class ArrayTypes {

	public static void main(String[] args) {
		int[] arr;
		int arr2[];

		arr = new int[10];
		System.out.println(arr.length);
		System.out.println(arr[0]);

		double[] arr3 = new double[10];
		System.out.println(arr3[0]);

		boolean[] arr4 = new boolean[10];
		System.out.println(arr4[0]);
		// System.out.println(arr4[10]); //out of bounds exception
		int[] arr5 = { 3, 2, 1 };

		// you can make an array of arrays
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(matrix[1][2]);

		int[][] matrix2 = new int[10][10];
		System.out.println(matrix2[0]); // prints the "value" which is a reference in this case

		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5); // will alter the array afterwards
		System.out.println(Arrays.toString(arr5));
	}
}
