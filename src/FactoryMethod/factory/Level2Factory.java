package FactoryMethod.factory;

import FactoryMethod.model.Dragon;
import FactoryMethod.model.Monster;
import FactoryMethod.model.Orc;

public class Level2Factory extends MonsterFactory{

	protected Monster createMonster(String monsterType) {
		if(monsterType.equals("Dragon")) {
			return new Dragon();
		} else if (monsterType.equals("Orc")) {
			return new Orc();
		}else return null;
	}

}
