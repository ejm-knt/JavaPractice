package program04;

public class MainP156 {

	public static void main(String[] args) {
		// for文を使って配列を扱う (P154 コード4-9)
		int [] scores = {10,20,30,40,50};
		int scoresSum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scoresSum += scores[i];
		}
		
		int scoresAvg = scoresSum / scores.length;
		
		System.out.println("合計点は" + scoresSum);
		System.out.println("合計点は" + scoresAvg);
		
	}

}
