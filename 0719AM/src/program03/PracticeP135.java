package program03;

public class PracticeP135 {

	public static void main(String[] args) {
		//練習3-1
		//次の日本語で記載された条件式をJavaで記述する
		
		/* Q: ① 変数weight の値が60に等しい
		 * 
		 * A: weight == 60
		 */

		/* Q: ② 変数age1 と age2 の合計を2倍したものが 60 を超えている
		 *  
		 * A: (age1 + age2) * 2 > 60
		 */
		
		/* Q: ③ 変数age が奇数である
		 * 
		 * A:  (age % 2) == 1
		 */
		
		/* Q: ④ 変数 name の中身の文字列が "湊" と等しい
		 * 
		 * A: name.equals("湊")
		 */
		
		//練習3-2
		//次に挙げる A から F の式のうち、条件式として適切なものを選んでください。
		
		/* A: cost = 300 * 1.05
		 * B: 3
		 * C: age != 30
		 * D: true
		 * E: b + 5 < 20
		 * F: isNumeric = true
		 * 
		 * C , D , E
		 */
		
		
		//練習3-3
		//次の内容に沿ったJavaプログラムを作成してください。
		
		// ①int型の変数isHungry を定義し、0か1を代入する(どちらを代入しても構わない)。
		//	 また、String型の変数foodを定義し、適当な食べ物の名前を代入
		int isHungry = 0;
		String food = "rice";
		
		// ②画面に「こんにちわ」と表示
		System.out.println("こんにちわ");
		
		/*  ③ もし変数isHungryが0であれば「お腹がいっぱいです」
		 *	   そうでなければ「はらぺこです」と表示
		 *	④ もし変数isHungryが空腹を示すならば、変数foodを利用して「"food"をいただきます」と表示
		 *	⑤ 最後に「ごちそうさま」と表示
		 */ 

			if (isHungry == 0) {
				System.out.println("お腹がいっぱいです");	
			} else {
				System.out.println("はらぺこです");
				System.out.println(food + "をいただきます");
			}
		
			System.out.println("ごちそうさまでした");
		
		//練習3-4
		/*
		 * Q: 次のようなjavaコードがあります。
		 * 
		 * ```java
		 * public class PracticeP135 {
		 * 		blic static void main(String[] args) {
		 * 		boolean tenki = true;
		 * 		if (tenki == true){
		 * 			System.out.println("洗濯をします");
		 *			System.out.println("散歩にいきます");
		 *		} else 
		 *			System.out.println("DVDを見ます");
		 * 		}
		 * }
		 * ```
		 * 
		 * 3行目のtenkiがfalseの場合、「DVDを見ます」の後に「寝ます」を表示するように変更するため、
		 * 8行目の次に「寝ます」と表示する行を以下のように追加しました。
		 * 
		 * ```java
		 * public class PracticeP135 {
		 * 		public static void main(String[] args) {
		 *	  		boolean tenki = true;
		 *	  		if (tenki == true){
		 *	  			System.out.println("洗濯をします");
		 *	 			System.out.println("散歩にいきます");
		 *	 		} else 
		 *	 			System.out.println("DVDを見ます");
		 *	 			System.out.println("寝ます");
		 * 		}
		 * }
		 * ```
		 * 
		 *  しかし、このプログラムは意図したように動きません。どの部分に誤りがあり、
		 *  どのような現象が発生しているかを答えてください。
		 *  そして、誤りを修正するには、どうすればよいかを考えてください。
		 *  
		 */
		
		// A: 意図したように動かない理由
		// 「elseの後に {} がない場合、elseの後の記述1行しか認識できないため、
		//	 else条件を満たしてもelseの後の「DVDを見ます」しか認識できないため。」
		
		// 誤りを修正するには、elseの後を改めて{}で閉じてあげれば解決する
		//	public class PracticeP135 {
		// 		public static void main(String[] args) {
			  		boolean tenki = false;
			  		if (tenki == true){
			  			System.out.println("洗濯をします");
			 			System.out.println("散歩にいきます");
			 		} else { 
			 			System.out.println("DVDを見ます");
			 			System.out.println("寝ます");
			 		}
		 		
		//  	}
		//	}
		
		//練習3ｰ5
		// switch文を用いて次の条件をみたすプログラムを作成してください。
		// ① 画面に「[メニュー]1:検索 2:登録 3:削除 4:変更>」と表示。表示後は改行しないこと
		// ② 数字を入力し、変数selectedに代入する(ヒント:2.6.6項を参照)
		// ③ もし変数seletedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」表示
		// ④ seletedが1から4のいずれでもない場合は何もしない
		
			  System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
			  int selected = new java.util.Scanner(System.in).nextInt();
			  
			  switch (selected) {
			  	case 1:
			  		System.out.println("検索します");
			  		break;
			  	
			  	case 2:
			  		System.out.println("登録します");
			  		break;
			  
			  	case 3:
			  		System.out.println("削除します");
			  		break;
			  
			  	case 4:
			  		System.out.println("変更します");
			  		break;
			  }
		
		//練習3ｰ6
		//次の条件に従って、プログラムを記述してください。
		// ①画面に「【数あてゲーム】」と表示			  
		// ②0から9までの整数の中からランダムな数を1つ生成して変数ansに代入(ヒント:2.6.5項を参照)	  
		// ③for文を用いた「5回繰り返すループを作る。」その際に、以下の④～⑦は、ループ内に記述
		/* ！ループ内容！
		 * ④画面に「0～9の数字を入力してください」と表示
		 * ⑤数字を入力し、変数numに代入する(ヒント:2.6.6項を参照)
		 * ⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して、繰り返しを終了
		 * ⑦もし変数numが変数ansと等しくなかった場合は「違います」と表示
		 * 
		 * (追加依頼！)
		 * ① 答えた数字より大きいか、小さいかをヒントとして毎回表示する
		 * ② 5回の内、今何回入力したかを表示させる
		 * ③ 数あてゲーム終了時に結果発表をする。（〇回で当てられました！ など）
		 */
		// ⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する

			  System.out.println("【数あてゲーム】");
			  System.out.println("説明: 0から9のランダムな数字を1つ生成するので、プレイヤーはその数字を当てよう！");
			  int ans = new java.util.Random().nextInt(10);
			  for (int i = 0 ; i < 5 ; i++) {
				  System.out.println("0～9の数字を入力してください");
				  int num = new java.util.Scanner(System.in).nextInt();
				  
				  //動作確認用。実装時は下記コードをコメントアウト
				  //System.out.println(ans); 
				  
				  if (num > 9 || num < 0) {
					  i--;
					  System.out.println("無効な数値が入力されています！");
					  System.out.println("残り" + (5-(i+1)) + "回！ [" + (i+1) +"/5]");
					  continue;
			  	  } else if (ans == num) {
					  System.out.println("アタリ！");
					  System.out.println("オメデトウ！今回は" + (i+1) + "回で当てられたよ！");
					  break;
				  } else if (ans > num) {
					  System.out.println("違います！\n答えのほうが大きいです。");
					  System.out.println("残り" + (5-(i+1)) + "回！ [" + (i+1) +"/5]");
				  } else {
					  System.out.println("違います！\n答えのほうが小さいです。");
					  System.out.println("残り" + (5-(i+1)) + "回！ [" + (i+1) +"/5]");
				  }
			  }
			 System.out.println("答えは" + ans + "でした！");
			 System.out.println("ゲームを終了します");
	}

}
