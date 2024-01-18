package drivePractice03;

public class Q05 {
//	引数でintの値を1つ受け取ると、
//	１からその値までの和を求め返却するメソッドを作成する。
//	mainメソッドにて整数を1つ受け取り、和を求める処理を作成せよ。
//
//	[実行例]
//	1からいくつまで足しますか>10
//	1から10までの和は55です。

	public static void main(String[] args) {
		System.out.print("1からいくつまで足しますか>");
		int inputNum = new java.util.Scanner(System.in).nextInt();
		
		System.out.print
		("1から"+ inputNum +"までの和は"+ totalFrom1toN(inputNum) + "です。");
	}

	public static int totalFrom1toN(int x) {
		int sum = 0;
		
		for (int i = 0 ; i <= x; i++) {
			sum += i;
		}
		
		return sum;
	}
}
