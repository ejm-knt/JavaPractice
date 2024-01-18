package program04;

public class PracticeP176 {

	public static void main(String[] args) {
		// 練習4-1
		
		/*	次の条件を満たす各配列を準備するプログラムを作成してください。
		 * 	なお、以下の4つの配列を1つのプログラムの中に記述して構いません。
		 * 	また、値の初期化は不要です。
		 */

		// ① int型の値を4つまとめて格納できる配列 points
		int[] points = new int[4];
		//System.out.println(Arrays.toString(points));
		
		// ② double型の値を5個まとめて格納できる配列 weights
		double[] weights = new double[5];
		//System.out.println(Arrays.toString(weights));
		
		// ③ boolean型の値を3つまとめて格納できる配列 answers
		boolean[] answers = new boolean[3];
		//System.out.println(Arrays.toString(answers));
		
		// ④ String型の値を3つまとめて格納できる配列 names
		String[] names = new String[3];
		//System.out.println(Arrays.toString(names));
		
		
		// 練習4-2
		
		/*	次に示す3つの条件を満たすプログラムを作成してください。
		 * 	① 3つの口座残高「121902」「8302」「55100」が格納されている
		 *     int型配列 moneyList を宣言します
		 * 	② その配列の要素を1つずつfor文で取り出して画面に表示します。
		 *  ③ 同じ配列の要素を拡張for文で1つずつ取り出して画面に表示します。
		 */	
		
		// 1
		int[] moneyList = {121902 , 8302 , 55100};
		
		// 2
		for (int i = 0 ; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		// 3
		for (int value : moneyList) {
			System.out.println(value);
		}
		
		
		// 練習4-3
		
		/*	次のコードを実行すると、5,6行目で例外が発生します。
		 * 	それぞれの行で発生する例外の名前を教えてください。
		 */	
		
		/*	3 int[] counts = null;
		 *	4 float[] heights = {171.3F,175.0F};
		 *	5 System.out.println(counts[1]);
		 *	6 System.out.println(heights[2]);
		 */
		
		// 5行目 : NullPointerException
		// 6行目 : ArrayIndexOutOfBoundsException
		
		// 練習4-4
		
		/*	次の条件を満たす「数当てクイズ」のプログラムを作成してください。
		 * 	① int型で要素数3の配列 numbers を準備します。
		 * 	   このときの初期値はそれぞれ「3」「4」「9」とします。
		 * 	② 画面に「1桁の数字を入力してください」と表示します。
		 *  ③ 次のコードを用いてキーボードから数字の入力を受け付け
		 *     変数 input に代入します。
		 *  ※ int input = new java.util.Scanner(System.in).nextInt();
		 *  
		 *  ④ 配列をループで回しながら、いずれかの要素と等しいかを調べます。
		 *     もし等しければ「アタリ！」と表示します。
		 */
		
		int[] numbers = {3,4,9};
		
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int value : numbers) {
			if (input == value) {
				System.out.println("アタリ！");
				break;
			}
		}
		
		
	}

}
