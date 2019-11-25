package com.accenture.lecture16;

public class WarriorApp {
	
	
	public static void main(String[] args) {
		
		Warrior janka = new Warrior("Janka", 150, 23);
		Warrior vitaly = new Warrior("Vitaly", 100, 50);
		
		janka.fight(vitaly);
		vitaly.fight(janka);
		janka.fight(vitaly);
		vitaly.fight(janka);
		janka.fight(vitaly);
		janka.fight(vitaly);

	}

}
