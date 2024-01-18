package drivePractice03;

public class Q10 {
		//	引数でintの値を受け取り、偶数か奇数か判断し
		//	偶数の場合はtrueを奇数の場合はfalseを返却するメソッドを作成する。
		//	mainメソッドで数値を一つ入力させ、偶数か奇数か求める処理を作成せよ。
		//
		//	[実行例]
		//	整数を入れてください。>17
		//	17は奇数です。
	
	public static void main(String[] args) {
		System.out.print("整数を入れてください。>");
		int num = new java.util.Scanner(System.in).nextInt();
		
		if (judgeEven(num) == true) {
		System.out.print(num + "は偶数です。");
		} else {
		System.out.print(num + "は奇数です。");		
		}
	}

	public static boolean judgeEven(int x) {
		boolean judge;
		
		if(x%2 == 0) {	
			judge = true;
		} else {
			judge = false;
		}
				
		return judge;
	}
	
}
