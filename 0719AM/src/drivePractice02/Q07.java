package drivePractice02;

public class Q07 {

	public static void main(String[] args) {
		/* 「Q07」クラスを作成し、
			人数を聞き、その人数分の点数を配列に読み込んで合計を求める。
			[実行例]
			何人?>2
			1人目の点数を入力してください>20
			2人目の点数を入力してください>30
			合計点数は50点です。
		*/
		
		System.out.print("何人？> ");
		int count = new java.util.Scanner(System.in).nextInt();
		
		int score = 0;					// 各点数
		int scoreSum = 0;				// 合計得点格納
		int[] scores = new int[count];	// 配列の格納数。入力数で格納数が変動。
		
		// 入力人数分を繰り返し
		// 人数分の得点を配列に格納する
		for (int i = 0 ; i < count ; i++) {
			System.out.println((i+1) + "人目の点数を入力してください>");
			score = new java.util.Scanner(System.in).nextInt();
			scores[i] = score;
		}
		
		// デバック用
		// System.out.println(Arrays.toString(scores));
		
		// 従来for文
		// for (int i = 0; i < scores.length; i++) {
		// 		scoreSum += scores[i];
		// }
		
		// 拡張for文
		for (int sum : scores) {
			scoreSum += sum;
		}
		
		System.out.println("合計得点は" + scoreSum + "点です。");
		
	}
}
