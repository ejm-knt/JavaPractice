package program11;

public class Hero extends Character {
	
	public Hero (String name) {
		super(name);
	}
	
	public  void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;		
		System.out.println("敵に10ポイントのダメージをあたえた！");
	}
	
}
