package program03;

public class MainP119 {

	public static void main(String[] args) {
		// 冗長ですっきりしないコード(P119 コード3-4)
		System.out.println("あなたの運勢を占います。");

		//乱数生成（範囲：1から4）
		int fortune = new java.util.Random().nextInt(4) + 1;

		/*
		 * Switch文を書くための前座で、あえてif-elseで冗長な処理を書いていく
		 */

		//		//結果を分岐して表示
		//		if(fortune == 1) {
		//			System.out.println("大吉");
		//		} else if(fortune == 2) {
		//			System.out.println("中吉");
		//		} else if(fortune == 3) {
		//			System.out.println("吉");
		//		} else {
		//			System.out.println("凶");			
		//		}

		/*
		 * Switch文で書き直した場合(P120 図3-14 Switch構文)
		 */
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		default:
			System.out.println("凶");
		}

	}

}
