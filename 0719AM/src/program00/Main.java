package program00;

public class Main {

	public static void main(String[] args) {
		//テキスト型の出力
		System.out.println("コンソール");
		System.out.println("マーカー");
		System.out.println("実行(R)>実行(S)>Javaアプリケーション(Alt+Shift+X -> J)");
		System.out.println("31+31の計算をします。");
		
		//数値型の出力
		//加算
		System.out.println(31 + 31);
		
		//減算
		System.out.println(31 - 31);
		
		//乗算
		System.out.println(31 * 31);
		System.out.println(-31 * 31);
		
		//除算
		System.out.println(31 / 31);

		//テキスト型と数値型の混合出力の方法
		System.out.println("こたえは" + 62);

		//変数宣言と変数を用いた計算
		int x;	//int は 数値であるということらしい
		x = 6;
		System.out.println(x * x * 3.14);

		System.out.println(2000000000 * 3);
	}

}
