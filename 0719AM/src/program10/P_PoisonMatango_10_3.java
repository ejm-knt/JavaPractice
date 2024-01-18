package program10;

public class P_PoisonMatango_10_3 extends P_Matango_10_3 {
	int poisonAttackLimit = 5;
	
	public P_PoisonMatango_10_3(char suffix) {
		super(suffix);
	}
	
	public void attack(P_Hero_10_3 h) {
		super.attack(h);
		
		if (this.poisonAttackLimit > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damege = h.hp/5;
			h.hp -= damege ;
			System.out.println(damege + "ポイントのダメージ！");
			this.poisonAttackLimit --;
		}
	}
}
