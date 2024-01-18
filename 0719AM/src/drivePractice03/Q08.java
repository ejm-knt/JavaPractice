package drivePractice03;

public class Q08 {

//	価格（int）を引数で受け取り、消費税込みの値段を表示するメソッドを作成する。
//	mainメソッドで価格を入力させ、実行例のようになるようにせよ。
//
//	[実行例]
//	価格を入力してください>100
//	100円は消費税込みで108円です

	public static void main(String[] args) {
		System.out.print("価格を入力してください>");
		int inputMoney = new java.util.Scanner(System.in).nextInt();
		taxCalculation(inputMoney);
	}

	public static void taxCalculation(int money) {
		double taxManey = money * 1.08;
		System.out.println(money+"円は消費税込みで"+ (int)taxManey +"");
	}

}
