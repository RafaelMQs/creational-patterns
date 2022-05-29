package FactoryMethod.model;

public abstract class Monster {

	public abstract void getMonsterStatus();

	public void attack() {
		System.out.println("Attacking the player");
	}
	
	public void defense() {
		System.out.println("Defending player attack");
	}
	
	public void dialog() {
		System.out.println("Hello player, how are you?");
	}
	
}
