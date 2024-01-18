package testCode;
//天気を手入力させて、晴だった場合と雨だった場合で出力される内容を変えるコードを書いてみたいのでテスト

public class TestWhileIf {

	public static void main(String[] args) {
		//天気を尋ね、入力
		System.out.println("今の天気は？\n晴か雨で入力してください。");
		String whether = new java.util.Scanner(System.in).nextLine();
				
		//「晴or雨入力以外」で侵入
		//侵入時に再入力を求める
		while (!(whether.equals("晴") || whether.equals("雨"))) {
			System.out.println("晴か雨で入力してください");
			whether = new java.util.Scanner(System.in).nextLine();
		}

		//晴なら洗濯+散歩。雨ならDVDを見る。
		if (whether.equals("晴")) {
			System.out.println("洗濯をする");
			System.out.println("散歩をする");
		} else {
			System.out.println("DVDを見る");
		}
	}
}

//以下 失敗作
/*
 * 気付きメモ
 * ① ifを先に書いてしまうと、繰り返しがうまく作動しなかった
 * ② Whileを先に書いて問題なければifに移るという挙動が正しいと気づいた
 * ③ Whileの条件がTrueでないと無視する(Whileを開始しない)法則を利用した 
 */

//if(whether.equals("晴")) {
//System.out.println("洗濯をする");
//System.out.println("散歩をする");
//}else if(whether.equals("雨")){
//System.out.println("DVDを見る");
//}else {
//System.out.println("今の天気は？");
//whether = new java.util.Scanner(System.in).nextLine();
//
//while(whether.equals("晴")||whether.equals("雨")) {
//}
