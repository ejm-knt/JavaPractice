package program17;

public class P_Main_17_1 {

	public static void main(String[] args) {
		
		try {
		String s = null;
		System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("-- スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("-- スタックトレース（ここまで）--");

		}
	}

}
