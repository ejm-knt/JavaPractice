package program10;

public class P_Main_10_3 {
	
	public static void main(String[] args) {
		P_PoisonMatango_10_3 pm = new P_PoisonMatango_10_3('A');
		P_Matango_10_3 m = new P_Matango_10_3('A');
		P_Hero_10_3 h = new P_Hero_10_3();
		pm.attack(h);
		pm.attack(h);
		System.out.println(h.hp);
		
	}
	
	
	
}
