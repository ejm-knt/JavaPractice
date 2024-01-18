package drivePractice04;

import java.util.Scanner;

public class Main_Q03_5 {
//	Ｑ１のCalculationクラスにevenNumberJudge()を作る。
//	処理内容：１つのint型の引数を受け取り、偶数ならtrue、奇数ならfalseをreturnする。
//
//	「Main_Q1_5」クラスのmain()で１つの整数を入力してもらい、
//	evenNumberJudge()を呼んで評価がtrueなら「偶数です」falseなら「奇数です」と出力
//
//	ーーーーーーーーーーーーーーーーーーーーーーーー
//
//	[実行結果]
//
//	１つの整数を入力して下さい
//	６
//	偶数です
	
	public static void main(String[] args) {
		System.out.println("１つめの整数を入力して下さい");
		int num1 = new Scanner(System.in).nextInt();
		
		if (Calculation.evenNumberJudge(num1) == true ) {
			System.out.println("偶数です");	
		} else {
			System.out.println("奇数です");
		}
		

	}

}
