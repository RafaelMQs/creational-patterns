package FactoryMethod.factory;

import FactoryMethod.model.Elf;
import FactoryMethod.model.Monster;
import FactoryMethod.model.Zombie;

public class Level1Factory extends MonsterFactory{

	protected Monster createMonster(String monsterType) {
		if(monsterType.equals("Elf")) {
			return new Elf();
		} else if (monsterType.equals("Zombie")) {
			return new Zombie();
		}else return null;
	}

}
