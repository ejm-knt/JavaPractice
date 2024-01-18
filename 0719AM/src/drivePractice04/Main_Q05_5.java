package drivePractice04;

import java.util.Scanner;

public class Main_Q05_5 {
	
//	Ｑ１のCalculationクラスにarrayGeneration()を作る。
//	処理内容：１つのint型の引数を受け取り、その引数を用いて配列を生成。
//	　　　　　配列の要素数分繰り返しを行い、1～100の乱数を入れ、その配列をreturnする。
//
//	「Main_Q1_5」クラスのmain()で１つの整数を入力してもらい、
//	arrayGeneration()を呼び、評価された配列を受け取り、
//	拡張for文で表示
//
//
//	[実行結果]
//
//	配列の要素数を入力して下さい
//	4
//	配列の中身は・・・
//	28
//	5
//	53
//	8

	public static void main(String[] args) {
		System.out.println("配列の要素数を入力して下さい");
		int inputNum = new Scanner(System.in).nextInt();

		int[] nums = new int[inputNum];
		
		Calculation.arrayGeneration(nums);
		
		System.out.println("配列の中身は・・・");
		
//		for (int i = 0 ; i < nums.length ; i++) {
//			System.out.println(nums[i]);
//		}
		
		for (int value : nums) {
			System.out.println(value);
		}
		
	}

}
