package com.it.berdeja.oop;

import java.util.Arrays;

public class Account {
	
	int id;
	Transaction[] transactions;
	
	public Account(int id) {
		this.id = id;
		this.transactions = new Transaction[0];
	}
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    Transaction sender = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
	    Transaction receiver = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
	    
	    this.transactions = Arrays.copyOf(transactions, transactions.length + 1);
	    this.transactions[transactions.length - 1] = sender;
	    
	    accountTo.transactions = Arrays.copyOf(accountTo.transactions, accountTo.transactions.length + 1);
	    accountTo.transactions[accountTo.transactions.length - 1] = receiver;
	}
	
	public void withdrawMoney(double moneyAmount) {
		Transaction transaction = new Transaction(this, moneyAmount, StandardAccountOperations.WITHDRAW);
		this.transactions = Arrays.copyOf(transactions, transactions.length + 1);
	    this.transactions[transactions.length - 1] = transaction;
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}
	
	public static class Transaction {
        

		private Account accountFrom;
        private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;
        
        public Transaction(Account accountFrom, double moneyAmount, StandardAccountOperations operation){
        	this.accountFrom = accountFrom;
        	this.moneyAmount = moneyAmount;
        	this.operation = operation;
        }
        
        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation){
        	this.accountFrom = accountFrom;
        	this.accountTo = accountTo;
        	this.moneyAmount = moneyAmount;
        	this.operation = operation;
        }
        
        public Account getAccountFrom() {
        	return accountFrom;
        }
        
        public Account getAccountTo() {
			return accountTo;
		}

		public double getMoneyAmount() {
			return moneyAmount;
		}

		public StandardAccountOperations getOperation() {
			return operation;
		}
	}
}
