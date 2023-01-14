package com.it.berdeja.basics;
import java.util.Scanner;

public class PyramidInConsole {
    public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in); 
        int height = sc.nextInt();
        int i = 0;
        while (i < height) {
        	System.out.println(strMaker(i+1));
        	i++;
        }
        i--;
        while (i > 0) {
        	System.out.println(strMaker(i));
        	i--;
        }
    }
    public static String strMaker(int length) {
    	StringBuilder sb = new StringBuilder();
    	while (length > 0) {
    		sb.append("*");
    		length--;
    	}
    	return sb.toString();
    }
}
