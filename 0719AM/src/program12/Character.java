package program12;

public abstract class Character implements Life {
	String name;
	int hp;
	
	public Character (String name , int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//たたかう
	public abstract void attack(Monster m) ;
	//	{
	//		System.out.println(this.name + "の攻撃！");
	//		m.hp -= 10;		
	//		System.out.println("敵に？？ポイントのダメージをあたえた！");
	//	}

}
