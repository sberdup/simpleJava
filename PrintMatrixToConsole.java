package com.it.berdeja;

public class PrintMatrixToConsole {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		int displayLength = 0;
		for (int[] m : matrix) {
			if (m.length > displayLength) {
				displayLength = m.length;
			}
		}
		for (int[] m : matrix) {
			for (int i = 0; i<m.length; i++) {
				try {
					System.out.print(m[i]);
				} catch (Exception ex) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
