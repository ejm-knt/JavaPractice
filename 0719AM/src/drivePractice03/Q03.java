package drivePractice03;

public class Q03 {
//	引数でintの値を受け取るとそれを３乗した値を返すメソッドを作成する。
//	mainメソッドで数値を一つ入力させ、実行例のようになるようにせよ。
//
//	[実行例]
//	整数を入れてください。>17
//	17を３乗すると4913です。

	public static void main(String[] args) {
	System.out.print("整数を入れてください。>");
	int inputNum = new java.util.Scanner(System.in).nextInt();
	System.out.println(inputNum + "を3乗すると" + cubicInt(inputNum) + "です。");
	
	}
	
	public static int cubicInt(int num) {
		int cubic = num * num * num;
		return cubic;
	}
	
}
