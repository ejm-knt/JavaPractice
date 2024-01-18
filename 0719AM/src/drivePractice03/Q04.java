package drivePractice03;

public class Q04 {
//	引数でintの値を3つ受け取ると、その中の最大値を返却するメソッドを作成する。
//	mainメソッドにて整数を３つ受け取り、最大値を求める処理を作成せよ。
//
//	[実行例]
//	整数1を入れてください。>3
//	整数2を入れてください。>10
//	整数3を入れてください。>4
//	3つの整数値の最大は10です。

	public static void main(String[] args) {
		System.out.print("整数1を入れてください。>");
		int inputNum1st = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("整数1を入れてください。>");
		int inputNum2nd = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("整数1を入れてください。>");
		int inputNum3rd = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("3つの整数値の最大は" + maxInt(inputNum1st , inputNum2nd , inputNum3rd) + "です。");
	}
	
	public static int maxInt(int x ,int y , int z) {
		// 中身のロジックはさぼった。
		// 汎用性をもたせるのであれば、for文で書くべき。
		
		int xy = Math.max(x ,y);
		int yz = Math.max(y, z);
		int maxInt = Math.max(xy, yz);
		
		return maxInt;
	}

}
