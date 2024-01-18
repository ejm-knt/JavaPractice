package drivePractice03;

public class Q09 {
//		引数でintの値を2つ受け取り、その平均値(int)を返却するメソッドを作成する。
//		※平均の計算は整数で行い、小数点以下は切り捨ててよい。
//		mainメソッドにて整数を2つ受け取り、平均値を求める処理を作成せよ。
//	
//		[実行例]
//		整数1を入れてください。>50
//		整数2を入れてください。>60
//		2つの整数値の平均は55です。
	
	public static void main(String[] args) {
		System.out.print("整数1を入れてください。>");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("整数2を入れてください。>");
		int num2 = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("2つの整数値は平均" + aveNum(num1,num2) + "です。");
		
	}
	
	public static int aveNum(int x , int y) {
		int ave = (x + y) / 2;
		return ave;
	}

}
