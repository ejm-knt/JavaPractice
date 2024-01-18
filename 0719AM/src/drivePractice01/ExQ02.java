package drivePractice01;

public class ExQ02 {

	public static void main(String[] args) {
		/* Mathクラスを利用して累乗計算を行う方法
		 * Mathクラスは、指数関数、対数関数、平方根、および三角関数といった
		 * 基本的な数値処理を実行するためのメソッドを提供しています。
		 * public static double pow(double a,double b)　メソッドは、
		 * 1番目の引数を、2番目の引数で累乗した値を返します。
		 */
		int a = 3;
		int x = 10;		
		
		int result = (int) Math.pow(a, x);
		
		System.out.print(a + "の" + x + "乗は" + result + "です");
		
		
	}

}
