package program12;

public class Thief extends Character {

	public Thief(String name , int hp) {	
		super(name , hp);
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");	
		System.out.println("敵に3ポイントのダメージをあたえた！");
		m.hp -= 4;
		
	}
	
}
