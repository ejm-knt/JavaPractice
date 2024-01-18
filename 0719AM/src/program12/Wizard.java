package program12;

public class Wizard extends Character  {
	int mp;
	
	public Wizard (String name , int hp , int mp) {
		super(name , hp);
		this.mp = mp;
	}
		
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");	
		System.out.println("敵に3ポイントのダメージをあたえた！");
		m.hp -= 3;
	}
	
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉ストレートを放った！");	
		System.out.println("敵に20ポイントのダメージをあたえた！");
		m.hp -= 20;
		this.mp -= 5;
	}
}
