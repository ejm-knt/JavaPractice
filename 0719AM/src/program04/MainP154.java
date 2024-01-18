package program04;

public class MainP154 {

	public static void main(String[] args) {
		// 配列記法ミス時のエラー文 (P154 コード4-8)

		int [] scores = {10,20,30,40,50};
		
		//修正前
		//int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];

		//修正後
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[0];		
		
		int avg = sum / scores.length;
		
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);
		
	}

}
