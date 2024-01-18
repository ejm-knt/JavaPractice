package program10;

public class P_Matango_10_3 {
	int hp = 50;
	char suffix;
	
	public P_Matango_10_3 (char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(P_Hero_10_3 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	
}
