package com.accenture.lecture18;

public class Account {
	private String id;
	private String name;
	private int balance = 10;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return balance + amount;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			this.balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account anotherAccount, int amount) {
		if (amount <= balance) {
			anotherAccount.balance = anotherAccount.balance + amount;
			this.balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account = " + getId() + ", Name = " + getName()
				+ ", Balance = " + getBalance() + "";
	}

	public static void main(String[] args) {
		Account ieva = new Account("2839", "Ieva", 350);
		Account janis = new Account("9922", "Janis", 100);

		System.out.println(ieva);
		System.out.println(janis);

		ieva.transferTo(janis, 30);
		System.out.println(janis);

	}

}
