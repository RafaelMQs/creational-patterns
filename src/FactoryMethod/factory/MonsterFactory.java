package FactoryMethod.factory;

import FactoryMethod.model.Monster;

public abstract class MonsterFactory {
	
	public Monster orderMonster(String monsterType) {
		Monster monster = null;
		
		monster =	createMonster(monsterType);
		monster.getMonsterStatus();
		monster.attack();
		monster.defense();
		monster.dialog();
		
		return monster;
	}
	
	protected abstract Monster createMonster(String monsterType);
}
