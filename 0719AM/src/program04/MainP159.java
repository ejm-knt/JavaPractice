package program04;

public class MainP159 {

	public static void main(String[] args) {
		// 50点以上の科目の数を調べる (P159	コード4-11)
		int[] scores = {30,40,50,60,70};
		int count = 0;
		
		for (int i = 0; i < scores.length; i++) {
			// if使って、scoresの[i]番目がint50以上だった場合、countを1する条件に設定
			if (scores[i] >= 50) {
				count++;
			}
		}
		
		System.out.println("50点以上の科目は" + count);
	}

}
