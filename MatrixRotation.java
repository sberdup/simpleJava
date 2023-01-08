package com.it.berdeja;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}
    public static double[][] generateMatrix(int size) {
    	double[][] matrix = new double[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			matrix[i][j] = (i * 1) + (j * 0.1d);
    		}
    	}
    	return matrix;
    }
	
    public static void printMatrixToConsole( double[][] matrix) {
    	for (double[] m : matrix) {
    		System.out.println(Arrays.toString(m));
    	}
    }
    
    public static boolean rotateMatrix( double[][] matrix, int mode) {
    	switch (mode) {
    	case 1:
    		rotate90(matrix);
    		return true;
    	case 2:
    		rotate180(matrix);
    		return true;
    	case 3:
    		rotate270(matrix);
    		return true;
    	default:
    		return false;
    	}
    }
    
	public static void rotate90(double[][] matrix) {
		double[][] matrixCopy = matrix.clone();
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
    			matrixCopy[i][j] = matrix[matrix.length - 1 - i][j];
    		}
    	}
		matrix = matrixCopy;
	}

	public static void rotate180(double[][] matrix) {
		double[][] matrixCopy = matrix.clone();
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
    			matrixCopy[i][j] = matrix[i][matrix[i].length - j];
    		}
    	}
	}

	public static void rotate270(double[][] matrix) {
		double[][] matrixCopy = matrix.clone();
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
    			matrixCopy[i][j] = matrix[i][matrix[i].length - j];
    		}
    	}
	}

}
