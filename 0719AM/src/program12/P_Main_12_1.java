package program12;

public class P_Main_12_1 {

	public static void main(String[] args) {
		
		P_Y_12_1[] ys = new P_Y_12_1[2];

		ys[0] = new P_A_12_1();
		ys[1] = new P_B_12_1();
		
		for (P_Y_12_1 y : ys) {
			y.b();
		}
	}
}
