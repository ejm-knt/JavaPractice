package program11;

public abstract class Character {
	String name;
	int hp;
	
	public Character (String name) {
		name = this.name;
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//たたかう
	public abstract void attack(Matango m) ;
	//	{
	//		System.out.println(this.name + "の攻撃！");
	//		m.hp -= 10;		
	//		System.out.println("敵に？？ポイントのダメージをあたえた！");
	//	}

}
