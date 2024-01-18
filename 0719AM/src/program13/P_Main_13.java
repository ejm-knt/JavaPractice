package program13;

public class P_Main_13 {

	public static void main(String[] args) {
		P_Wizard_13 w = new P_Wizard_13();
		P_Hero_13 h = new P_Hero_13();
		P_Wand_13 wand = new P_Wand_13();
		
		w.setWand(wand);
		w.heal(h);
	}

}
