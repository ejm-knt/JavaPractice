package program04;

public class Practice4_4 {

	public static void main(String[] args) {
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
		
		
		int randomNumber; 			//乱数の箱
		int randomNumsMax = 100;	//乱数の上限
		int randomNumsCount = 10;	//発生乱数の個数
		int charrengeLimit = 5;		//挑戦回数
		
		//乱数格納配列
		int [] randomNums = new int[randomNumsCount];
		
		//forで乱数を個数分格納
		for (int i = 0 ; i < randomNums.length; i++) {
			randomNumber = new java.util.Random().nextInt(randomNumsMax)+1;
			randomNums[i] = randomNumber;
		}
		
		//デバック用
		//System.out.println(Arrays.toString(randomNums));
		
		System.out.println("数値当てゲームだ！チャンスは" + charrengeLimit + "回！");
		System.out.println("1 ~ 100の間で数字を入力 > ");
		
		for (int i = 0; i < charrengeLimit; i++) {
			int inputNum = new java.util.Scanner(System.in).nextInt();
			
//			if (inputNum == randomNumber) {
//				
//			}
			
		}
	}

}
