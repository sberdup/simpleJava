package com.it.berdeja;

public class AddNumbers {
	public static void main(String[] args) {
	   double num1 = Double.parseDouble(args[0]);
	   double num2 = Double.parseDouble(args[1]);
	   if (num1 == (int) num1 && num2 == (int) num2) {
		   System.out.println((int)(num1 + num2));
	   } else {
		   System.out.println(num1 + num2);
	   } 
	}
}
