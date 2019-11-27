package com.accenture.lecture16;

import java.util.ArrayList;
import java.util.Arrays;

public class Warrior {
	private String name;
	private int initialHealth;
	private int damagePower;

	public Warrior(String name, int initialHealth, int damagePower) {
		this.name = name;
		this.initialHealth = initialHealth;
		this.damagePower = damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return initialHealth;
	}

	public int getDamagePower() {
		return damagePower;
	}

	public boolean isAlive() {
		boolean isAlive;
		if (initialHealth > 0) {
			isAlive = true;

		} else {
			isAlive = false;
		}
		return isAlive;
	}

	public void recievedDamage(int damage) {
		if (isAlive()) {
			initialHealth = initialHealth - damage;
			System.out.println(this.name + " recieved damage, " + damage
					+ " health now is: " + this.initialHealth);
		} else {
			System.out.println(this.name + " is dead! Game over! Vitaly stooooop");
		}

	}

	public void restoreHealth(int health) {
		if (isAlive()) {
			initialHealth = initialHealth + health;
			System.out.println("Yeyy " + this.name + " recieved HP: " + health
					+ " health now is: " + this.initialHealth);
		} else {
			System.out.println("You are dead! Fail!");

		}

	}

	public void fight(Warrior anotherWarrior) {
		int damage = anotherWarrior.getDamagePower();
		this.recievedDamage(damage);
	}

	@Override
	public String toString() {
		return "Warrior [name=" + name + ", health=" + initialHealth + "]";
	}
	
}
