package FactoryMethod.model;

public class Dragon extends Monster{

	@Override
	public void getMonsterStatus() {
		System.out.println("Monster status");
		System.out.println("\t- 15Atk");
		System.out.println("\t- 15Ap");
		System.out.println("\t- 20Def");
		System.out.println("\t- 200Hp");
		System.out.println("\t- Elemental Dragon");
	}

}
