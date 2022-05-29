package FactoryMethod.model;

public class Elf extends Monster{

	@Override
	public void getMonsterStatus() {
		System.out.println("Monster status");
		System.out.println("\t- 10Atk");
		System.out.println("\t- 10Ap");
		System.out.println("\t- 20Def");
		System.out.println("\t- 150Hp");
		System.out.println("\t- Undead");
	}

}
