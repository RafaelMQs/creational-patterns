package FactoryMethod.model;

public class Zombie extends Monster{

	@Override
	public void getMonsterStatus() {
		System.out.println("Monster status");
		System.out.println("\t- 5Atk");
		System.out.println("\t- 20Ap");
		System.out.println("\t- 10Def");
		System.out.println("\t- 100Hp");
		System.out.println("\t- Mage");
	}

}
