package drivePractice04;

import java.util.Scanner;

public class Main_Q04_5 {

//	Ｑ１のCalculationクラスにfindNumber()を作る。
//	処理内容：１つのint型の引数を受け取り、１～100乱数を100回発生させ引数と一致すれば、
//		  「　〇回目に〇〇を発見！ループを止めます　」と表示させ、
//		  ループを中断させてtrueをreturnする。一致しなかったらfalseをreturnする。
//
//	「Main_Q1_5」クラスのmain()で100までの整数を１つ入力してもらい、
//	findNumber()を呼んで評価がtrueなら「見つかりました」falseなら「見つかりませんでした」と表示
//
//	ーーーーーーーーーーーーーーーーーーーーーーーー
//
//	[実行結果]（見つかった時）
//
//	１つの２桁の整数を入力してください
//	50
//	92回目に50を発見！ループを止めます
//	見つかりました
//
//
//	[実行結果]（見つからなかった時）
//
//	１つの２桁の整数を入力してください
//	50
//	見つかりませんでした
	
	public static void main(String[] args) {
		System.out.println("１つの２桁の整数を入力してください");
		int inputNum = new Scanner(System.in).nextInt();
		
		Calculation.findNumber(inputNum);
	}

}
