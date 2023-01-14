package com.it.berdeja.oop;

public class Test {
	public static void main(String[] args) {
		Account account1 = new Account(124);
		Account account2 = new Account(544);
		System.out.println(account1.getTransactions());
		account1.sendMoneyToAccount(account2, 15555);
		account1.withdrawMoney(1000);
		System.out.println(account1.getTransactions());
		System.out.println(account1.getTransactions());
	}
}
