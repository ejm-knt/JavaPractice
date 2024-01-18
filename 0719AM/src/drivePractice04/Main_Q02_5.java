package drivePractice04;

import java.util.Scanner;

public class Main_Q02_5 {

//	Ｑ１のCalculationクラスにhiku()を作る。
//	処理内容：２つのint型の引数を受け取り、減算して結果をreturnする。
//
//	Mainクラスのmain()で２つの整数を入力してもらい、hiku()を呼んで画面に出力。
//
//	ーーーーーーーーーーーーーーーーーーーーーーーー
//
//	[実行結果]
//
//	１つめの整数を入力して下さい
//	５
//	２つめの整数を入力して下さい
//	３
//	５ - ３ = ２
	
	public static void main(String[] args) {
		System.out.println("１つめの整数を入力して下さい");
		int num1 = new Scanner(System.in).nextInt();
		System.out.println("２つめの整数を入力して下さい");
		int num2 = new Scanner(System.in).nextInt();
		
		System.out.println(num1 + " - " + num2 + " = " + Calculation.hiku(num1, num2));
	}

}
