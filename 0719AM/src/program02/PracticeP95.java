package program02;

public class PracticeP95 {

	public static void main(String[] args) {
		/* 練習2-1:問題文
		 * 下記を実行すると 510になる
		 * これを15になるように修正せよ
		 * int x = 5;
		 * int y = 10;
		 * String ans = "x+yは" + x + y;
		 */
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
		
		/* 練習2-2
		 * 次の文法として正しいものをすべて選んで答えよ
		 * ① int x = 3 + 5.0;
		 * ② double d = 2.0F;
		 * ③ int number = "5";
		 * ④ String s = 2 + "人目";
		 * ⑤ byte b = 1;
		 * ⑥ double d = true;
		 * ⑦ short s = (byte)2;
		 */
		System.out.println("②と④と⑤と⑦");
		
		/* 練習2-3
		 * 以下の内容のプログラムを作成してください。
		 * 問題文はコメントにして各機能を実装することにする
		 */
		
		//画面に「ようこそ占いの館へ」と表示
		System.out.println("ようこそ占いの館へ");
		
		//画面に「あなたの名前を入力してください」と表示
		System.out.println("あなたの名前を入力してください");		
		
		//キーボードから1行の文字入力を受け付け、String型の変数nameに格納
		String name = new java.util.Scanner(System.in).nextLine();
		
		//画面に「あなたの年齢を入力してください」と表示
		System.out.println("あなたの年齢を入力してください");
		
		//キーボードから1行の文字入力を受け付け、String型の変数 ageStringに格納
		String ageString = new java.util.Scanner(System.in).nextLine();
		
		//変数ageStringの内容をint型に変換し、int型の変数ageに代入
		int age = Integer.parseInt(ageString);
		
		//0から3までの乱数を生成し、int型の変数fortuneに代入
		//(間違えたので注意！)乱数生成の上限値()は、指定値を"含まない(未満)"
		// →　1~3 を生成 → ()内は「 4 」
		int fortune = new java.util.Random().nextInt(4);
		
		//fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にする
		fortune++;

		//画面に「占いの結果が出ました！」と表示
		System.out.println("占いの結果が出ました！");
		
		//画面に「(年齢)歳の(名前)さん、あなたの運気番号は(乱数)です」と表示
		System.out.println(age + "歳の"+ name +"さん、あなたの運気番号は"+ fortune +"です");
		
		//画面に「1:大吉 2:中吉 3:吉 4:凶」と表示
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
	}

}