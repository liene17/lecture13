package com.accenture.lecture16;

import java.util.ArrayList;

public class WarriorApp {

	public static void main(String[] args) {

		Warrior janka = new Warrior("Janka", 150, 23);
		Warrior vitaly = new Warrior("Vitaly", 100, 50);
		// Warrior batman = new Warrior("Batman", 1000, 150);
		// Warrior joker = new Warrior("Joker", 150, 38);

		while (janka.isAlive() || vitaly.isAlive()) {

			janka.fight(vitaly);
			vitaly.fight(janka);

		}

		ArrayList<String> fightClub = new ArrayList<>();
		fightClub.add("Janka");
		fightClub.add("Vitaly");
		fightClub.add("Batman");
		fightClub.add("Joker");

		// ArrayList<Warrior> fightClub = new ArrayList<>();
		// fightClub.add(janka);
		// fightClub.add(vitaly);
		// fightClub.add(batman);
		// fightClub.add(joker);

	}

}
