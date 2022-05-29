package FactoryMethod;

import FactoryMethod.factory.Level1Factory;
import FactoryMethod.factory.Level2Factory;
import FactoryMethod.factory.MonsterFactory;
import FactoryMethod.model.Monster;

public class Player {
	public static void main(String[] args) {
		MonsterFactory monsterLevel1 = new Level1Factory();
		MonsterFactory monsterLevel2 = new Level2Factory();
		
		Monster monster = null;
		
		System.out.println("First Fase, sorting a monster for YOU");
		int randomNumber = (int) (Math.random() * 6) + 1;
		
		if( randomNumber <= 3) {
			 monster = monsterLevel1.orderMonster("Elf");
		} else {
			monster = monsterLevel1.orderMonster("Zombie");
		}
		System.out.println(monster);
		
		System.out.println("\nSecond Fase, sorting a monster for YOU");
		randomNumber = (int) (Math.random() * 6) + 1;
		if( randomNumber <= 3) {
			monster = monsterLevel2.orderMonster("Orc");
		} else {
			monster = monsterLevel2.orderMonster("Dragon");
		}
		System.out.println(monster);
	}
}
