package program17;

public class P_Main_17_3 {

	public static void main(String[] args) {

		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
			System.out.println("-- スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("-- スタックトレース（ここまで）--");
		}
	}

}
